package com.monnet.autoapi.model;

public class AutoOffRoad extends Auto {
    @Override
    public String usar() {
        return "Usando el auto para hacer offroad.";
    }

    public String activarLlantasAnchas() {
        return "Llantas anchas activadas para offroad.";
    }

    public String activarDobleTraccion() {
        return "Doble tracción activada para offroad.";
    }
}
