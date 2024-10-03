package com.monnet.autoapi.controller;

import com.monnet.autoapi.model.*;
import com.monnet.autoapi.service.AutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {

    private final AutoService autoService;

    public AutoController(AutoService autoService) {
        this.autoService = autoService;
    }

    @GetMapping("/modo/{dia}")
    public ResponseEntity<String> obtenerModo(@PathVariable String dia) {
        try {
            Auto auto = autoService.obtenerModoPorDia(dia);
            String resultado = auto.usar();

            // Si es modo Offroad, también activamos llantas y doble tracción.
            if (auto instanceof AutoOffRoad) {
                resultado += "\n" + ((AutoOffRoad) auto).activarLlantasAnchas();
                resultado += "\n" + ((AutoOffRoad) auto).activarDobleTraccion();
            }
            // Si es modo Carrera,  llantas especiales  e inyeccion a turbo.
            if (auto instanceof AutoCarrera) {
                resultado += "\n" + ((AutoCarrera) auto).activarLlantasCarrera();
                resultado += "\n" + ((AutoCarrera) auto).activarInyeccionTurbo();
            }
            // Si es modo Agente Secreto, activamos camuflaje y usamos armas.
            if (auto instanceof AutoAgenteSecreto) {
                resultado += "\n" + ((AutoAgenteSecreto) auto).activarCamuflaje();
                resultado += "\n" + ((AutoAgenteSecreto) auto).usarArmas();
            }

            return new ResponseEntity<>(resultado, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}