/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programatv;

/**
 *
 * @author isado
 */
public class RealityShow extends ProgramaTV {
    private String nomeApresentador;
    private int audienciasOnline;
    
    
    //Construtor (pego o que quero usar da Superclasse usando o 'super'
    public RealityShow(String titulo, int audienciasTv, String nomeApresentador, int audienciasOnline){
        super(titulo, audienciasTv);
        this.nomeApresentador = nomeApresentador;
        this.audienciasOnline = audienciasOnline;
    }
    
    //Reescrevo o método de somar o espectadores pois essa classe exige que some os espectadores da internet + normais
    @Override
    public int getTotalPessoasAssistindo(){
        return super.audienciasTv + this.audienciasOnline;
    }
    public String getNomeApresentador() {
        return nomeApresentador;
    }
}   
