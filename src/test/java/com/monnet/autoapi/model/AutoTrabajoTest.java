package com.monnet.autoapi.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoTrabajoTest {

    @Test
    public void testUsar() {
        AutoTrabajo autoTrabajo = new AutoTrabajo();
        String resultado = autoTrabajo.usar();
        assertEquals("Usando el auto para ir al trabajo.", resultado);
    }
}