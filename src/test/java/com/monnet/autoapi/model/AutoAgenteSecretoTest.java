package com.monnet.autoapi.model;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;
//import com.monnet.autoapi.model.AutoAgenteSecreto;
//import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoAgenteSecretoTest {
    AutoAgenteSecreto autoAgenteSecreto = new AutoAgenteSecreto();
    @Test
    public void testUsar() {
        String resultado = autoAgenteSecreto.usar();
        assertEquals("Activando modo agente secreto.", resultado);
    }

    @Test
    public void testActivarCamuflaje() {
        String resultado = autoAgenteSecreto.activarCamuflaje();
        assertEquals("Camuflaje activado para ocultarse.", resultado);
    }

    @Test
    public void testUsarArmas() {
        String resultado = autoAgenteSecreto.usarArmas();
        assertEquals("Usando armas preinstaladas.", resultado);
    }
}