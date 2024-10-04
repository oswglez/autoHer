package com.monnet.autoapi.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutoCarreraTest {
    AutoCarrera autoCarrera = new AutoCarrera();

        @Test
        public void testUsar() {
            String resultado = autoCarrera.usar();
            assertEquals( "Usando el auto para carreras.", resultado);
        }

        @Test
        public void testActivarLlantasCarrera() {
            String resultado = autoCarrera.activarLlantasCarrera();
            assertEquals("Llantas especiales activadas para carreras.", resultado);
        }

        @Test
        public void testActivarInyeccionTurbo() {
            String resultado = autoCarrera.activarInyeccionTurbo();
            assertEquals("Inyeccion turbo activada para carreras.", resultado);
        }
    }