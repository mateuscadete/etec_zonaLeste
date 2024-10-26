/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylist_numeros;

import java.util.ArrayList;

public class ArrayList_numeros {
    public static void main(String[] args) {
        // Criando variáveis
        int epar = 0;
        
        // Criando o arrayList numeros
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        // Adicionando elementos ao arrayList
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
     
        for (Integer numero : numeros) {
            if(numero % 2  == 0){
                epar = epar + 1;
                System.out.println("\n" + numero);
                System.out.println("\n" + epar);
            }
        }
        
    }
}
