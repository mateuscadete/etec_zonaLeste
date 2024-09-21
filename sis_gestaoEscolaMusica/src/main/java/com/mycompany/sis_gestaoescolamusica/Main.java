/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sis_gestaoescolamusica;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String args[]){
        //Criando o vetor para armazenar os dados
        String[] Vetor = new String[3];

        Scanner scanner = new Scanner(System.in);

        Aluno a1 = new Aluno(Vetor[0], Vetor[1], Vetor[2]);

        System.out.println("Digite a matricula, nome e idade do aluno: ");
        
        a1.matricula = scanner.nextLine();
        a1.nome = scanner.nextLine();
        a1.idade = scanner.nextLine();
        
        Vetor[0] = a1.matricula;
        Vetor[1] = a1.nome;
        Vetor[2] = a1.idade;
        
        motraValores(Vetor);
        
        
        
    }

        public static String[] motraValores(String[] v){
        for(int i=0; i<3; i++){
            System.out.println(v[i]);
        }
        return v;
    }
}
