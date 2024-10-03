package com.monnet.autoapi.model;

import org.junit.jupiter.api.Test;

import com.monnet.autoapi.model.AutoOffRoad;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoOffRoadTest {

    @Test
    public void testUsar() {
        AutoOffRoad autoOffRoad = new AutoOffRoad();
        String resultado = autoOffRoad.usar();
        assertEquals("Usando el auto para hacer offroad.", resultado);
    }

    @Test
    public void testActivarLlantasAnchas() {
        AutoOffRoad autoOffroad = new AutoOffRoad();
        String resultado = autoOffroad.activarLlantasAnchas();
        assertEquals("Llantas anchas activadas para offroad.", resultado);
    }

    @Test
    public void testActivarDobleTraccion() {
        AutoOffRoad autoOffroad = new AutoOffRoad();
        String resultado = autoOffroad.activarDobleTraccion();
        assertEquals("Doble tracción activada para offroad.", resultado);
    }
}