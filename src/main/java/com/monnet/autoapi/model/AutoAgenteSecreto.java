package com.monnet.autoapi.model;

public class AutoAgenteSecreto extends Auto {
    @Override
    public String usar() {
        return "Activando modo agente secreto.";
    }

    public String activarCamuflaje() {
        return "Camuflaje activado para ocultarse.";
    }

    public String usarArmas() {
        return "Usando armas preinstaladas.";
    }
}