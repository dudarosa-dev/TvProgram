/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programatv;

/**
 *
 * @author isado
 */
public class Main {

    public static void main(String[] args) {
        
        // Instanciação de uma Telenovela
        String[] elencoNovela = {"Actor 1", "Actriz 2", "Actor 3"};
        TeleNovela novela = new TeleNovela("Amor de Perdição", 250000, elencoNovela);

        // Instanciação de um Reality Show
        RealityShow reality = new RealityShow("Big Brother", 500000, "Cristina", 350000);

        // Exibição dos resultados de audiência
        System.out.println("Espetadores da Novela: " + novela.getTotalPessoasAssistindo());
        System.out.println("Espetadores do Reality Show: " + reality.getTotalPessoasAssistindo());
    }
}
