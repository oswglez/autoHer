package com.monnet.autoapi.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutoCarreraTest {

        @Test
        public void testUsar() {
            AutoCarrera autoCarrera = new AutoCarrera();
            String resultado = autoCarrera.usar();
            assertEquals( "Usando el auto para carreras.", resultado);
        }

        @Test
        public void testActivarLlantasCarrera() {
            AutoCarrera autoCarrera = new AutoCarrera();
            String resultado = autoCarrera.activarLlantasCarrera();
            assertEquals("Llantas especiales activadas para carreras.", resultado);
        }

        @Test
        public void testActivarInyeccionTurbo() {
            AutoCarrera autoCarrera = new AutoCarrera();
            String resultado = autoCarrera.activarInyeccionTurbo();
            assertEquals("Inyeccion turbo activada para carreras.", resultado);
        }
    }