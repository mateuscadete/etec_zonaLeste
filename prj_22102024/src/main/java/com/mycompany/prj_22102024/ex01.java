/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_22102024;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ex01 {

    public static void main(String args[]) {
        //Iniciando as variáveis
        int[] v = new int[10];
        int i = 0;
        int total = 0;

        Scanner scanner = new Scanner(System.in);

        //Atribuindo valores para a variável
        for (i = 0; i < 10; i++) {
            System.out.println("\n Digite um 1 número: ");
            v[i] = scanner.nextInt();
            total = total + v[i];
        }
        
        System.out.println("\n" + total);

        int maior = v[0];
        int menor = v[0];

        // Encontrando o maior e o menor número
        for (int num : v) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        
        System.out.println("\n O maior e: " + maior
            + "O menor e: " + menor);

    }
}
