package com.monnet.autoapi.controller;

import com.monnet.autoapi.model.*;
import com.monnet.autoapi.service.AutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping(value = "apiauto")

public class AutoController {

    private final AutoService autoService;

    public AutoController(AutoService autoService) {
        this.autoService = autoService;
    }

    @GetMapping("/modo/{dia}")
    public ResponseEntity<String> obtenerModo(@PathVariable("dia") String dia,
                @RequestParam(value = "camuflaje", required = false) Integer camuflaje,
                @RequestParam(value = "armas", required = false) Integer armas) {
        try {
            Auto auto = autoService.obtenerModoPorDia(dia);
            String resultado = auto.usar();

            // Si es modo Offroad, también activamos llantas y doble tracción.

            if (auto instanceof AutoOffRoad autoOffRoad) {
                resultado += "\n" + autoOffRoad.activarLlantasAnchas();
                resultado += "\n" + autoOffRoad.activarDobleTraccion();
            }
            // Si es modo Carrera,  llantas especiales  e inyeccion a turbo.
            if (auto instanceof AutoCarrera autocarrera) {
                resultado += "\n" + autocarrera.activarLlantasCarrera();
                resultado += "\n" + autocarrera.activarInyeccionTurbo();
            }
            // Si es modo Agente Secreto, activamos camuflaje y usamos armas.

            if (auto instanceof AutoAgenteSecreto autoAgenteSecreto) {
                if (!Objects.isNull(camuflaje) && camuflaje > 0) {
                    resultado += "\n" + autoAgenteSecreto.activarCamuflaje();
                }
                if (!Objects.isNull(armas) && armas > 0) {
                    resultado += "\n" + autoAgenteSecreto.usarArmas();
                }
            }

            return new ResponseEntity<>(resultado, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}