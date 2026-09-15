/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programatv;

/**
 *
 * @author isado
 */
public abstract class ProgramaTV {
    protected String titulo;
    protected int audienciasTv;

    // Construtor principal
    public ProgramaTV(String titulo, int audienciasTv) {
        this.titulo = titulo;
        this.audienciasTv = audienciasTv;
    }

    // Calcula o total de espetadores (pode ser sobrescrito nas subclasses)
    public int getTotalPessoasAssistindo() {
        return this.audienciasTv;
    }

    // Métodos de acesso
    public String getTitulo() {
        return titulo;
    }
}
