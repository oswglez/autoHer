package com.monnet.autoapi.model;

import org.junit.jupiter.api.Test;

import com.monnet.autoapi.model.AutoOffRoad;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoOffRoadTest {
    AutoOffRoad autoOffRoad = new AutoOffRoad();

    @Test
    public void testUsar() {
        String resultado = autoOffRoad.usar();
        assertEquals("Usando el auto para hacer offroad.", resultado);
    }

    @Test
    public void testActivarLlantasAnchas() {
        String resultado = autoOffRoad.activarLlantasAnchas();
        assertEquals("Llantas anchas activadas para offroad.", resultado);
    }

    @Test
    public void testActivarDobleTraccion() {
        String resultado = autoOffRoad.activarDobleTraccion();
        assertEquals("Doble tracción activada para offroad.", resultado);
    }
}