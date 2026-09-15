/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programatv;

/**
 *
 * @author isado
 */
public class TeleNovela extends ProgramaTV {
    private String[] listaAtores; //Crio meu vetor elenco, inciado vazio
    
    //Construtor da classe
    public TeleNovela(String titulo, int audienciasTv, String[] listaAtores){
        super(titulo, audienciasTv );
        this.listaAtores= listaAtores;
    }   
}
