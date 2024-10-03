package com.monnet.autoapi.service;

import com.monnet.autoapi.model.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AutoServiceTest {

    private final AutoService autoService = new AutoService();

    @Test
    public void testObtenerModoPorDia_Lunes() {
        Auto auto = autoService.obtenerModoPorDia("lunes");
        assertTrue(auto instanceof AutoTrabajo);
    }

    @Test
    public void testObtenerModoPorDia_Martes() {
        Auto auto = autoService.obtenerModoPorDia("martes");
        assertTrue(auto instanceof AutoCarrera);
    }

    @Test
    public void testObtenerModoPorDia_Viernes() {
        Auto auto = autoService.obtenerModoPorDia("viernes");
        assertTrue(auto instanceof AutoAgenteSecreto);
    }

    @Test
    public void testObtenerModoPorDia_DiaInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            autoService.obtenerModoPorDia("domingo");
        });
    }
}