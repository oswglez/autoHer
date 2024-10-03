package com.monnet.autoapi.service;

import com.monnet.autoapi.model.*;
import org.springframework.stereotype.Service;

@Service
public class AutoService {
    public Auto obtenerModoPorDia(String dia) {
        switch (dia.toLowerCase()) {
            case "lunes":
                return new AutoTrabajo();
            case "martes":
                return new AutoCarrera();
            case "miercoles":
            case "jueves":
                return new AutoOffRoad();
            case "viernes":
                return new AutoAgenteSecreto();
            default:
                throw new IllegalArgumentException("Día no válido: " + dia);
        }
    }
}
