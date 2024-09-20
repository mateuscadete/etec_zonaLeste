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
        String[] pessoa = new String[3];

        Scanner scanner = new Scanner(System.in);

        Aluno a1 = new Aluno(pessoa[0], pessoa[1], pessoa[2]);

        System.out.println("Digite a matricula, nome e idade do aluno: ");
        
        a1.matricula = scanner.nextLine();
        a1.nome = scanner.nextLine();
        a1.idade = scanner.nextLine();



    }

    public static String v[] (String v[]) {
        for(i=0; i<3; i++){
            v[i] = v[];

        }
        return v[];
    }
}
