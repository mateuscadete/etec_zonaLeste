package com.mycompany.arraylist;

import java.util.ArrayList;
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
        ArrayList<String> cities = new ArrayList<String>();
        
        // Adicionando frutas ao ArrayList
        cities.add("Banana");
        cities.add("Laranja");
        cities.add("Mexerica");
        cities.add("Melão");
        cities.add("Uva");
        
        // Exibindo a lista de frutas
        System.out.println("Lista de frutas: " + cities);
        
        // Removendo uma fruta
        cities.remove(1);
        System.out.println("Lista de frutas após remoção: " + cities);

        // Pedindo ao usuário para digitar a fruta que deseja buscar
        System.out.print("Digite o nome da fruta que deseja buscar: ");
        String frutaBuscada = scanner.nextLine();

        // Chamando o método de busca
        if (buscarFruta(cities, frutaBuscada)) {
            System.out.println("A fruta " + frutaBuscada + " está na lista.");
        } else {
            System.out.println("A fruta " + frutaBuscada + " não está na lista.");
        }

        scanner.close();
    }
}
