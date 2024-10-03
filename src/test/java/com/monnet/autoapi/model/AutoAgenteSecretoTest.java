package com.monnet.autoapi.model;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;
//import com.monnet.autoapi.model.AutoAgenteSecreto;
//import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoAgenteSecretoTest {

    @Test
    public void testUsar() {
        AutoAgenteSecreto autoAgenteSecreto = new AutoAgenteSecreto();
        String resultado = autoAgenteSecreto.usar();
        assertEquals("Activando modo agente secreto.", resultado);
    }

    @Test
    public void testActivarCamuflaje() {
        AutoAgenteSecreto autoAgenteSecreto = new AutoAgenteSecreto();
        String resultado = autoAgenteSecreto.activarCamuflaje();
        assertEquals("Camuflaje activado para ocultarse.", resultado);
    }

    @Test
    public void testUsarArmas() {
        AutoAgenteSecreto autoAgenteSecreto = new AutoAgenteSecreto();
        String resultado = autoAgenteSecreto.usarArmas();
        assertEquals("Usando armas preinstaladas.", resultado);
    }
}