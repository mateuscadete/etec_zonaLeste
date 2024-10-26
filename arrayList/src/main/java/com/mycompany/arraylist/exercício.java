package com.mycompany.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class exercício {
    // Método que busca uma fruta no ArrayList
    public static boolean buscarFruta(ArrayList<String> frutas, String fruta) {
        return frutas.contains(fruta);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> frutas = new ArrayList<String>();
        
        // Adicionando frutas ao ArrayList
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Mexerica");
        frutas.add("Melão");
        frutas.add("Uva");
        
        // Exibindo a lista de frutas
        System.out.println("Lista de frutas: " + frutas);
        
        // Removendo uma fruta
        frutas.remove(1);
        System.out.println("Lista de frutas após remoção: " + frutas);

        // Pedindo ao usuário para digitar a fruta que deseja buscar
        System.out.print("Digite o nome da fruta que deseja buscar: ");
        String frutaBuscada = scanner.nextLine();

        // Chamando o método de busca
        if (buscarFruta(frutas, frutaBuscada)) {
            System.out.println("A fruta " + frutaBuscada + " está na lista.");
        } else {
            System.out.println("A fruta " + frutaBuscada + " não está na lista.");
        }

        // Ordenando o ArrayList
        Collections.sort(frutas);

        // Exibindo seu conteúdo
        for (String nome : frutas) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
