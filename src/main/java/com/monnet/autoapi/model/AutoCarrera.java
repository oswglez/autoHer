package com.monnet.autoapi.model;

public class AutoCarrera extends Auto {
    @Override
    public String usar() {
        return "Usando el auto para carreras.";
    }

    public String activarLlantasCarrera() {
        return "Llantas especiales activadas para carreras.";
    }

    public String activarInyeccionTurbo() {
        return "Inyeccion turbo activada para carreras.";
    }
}