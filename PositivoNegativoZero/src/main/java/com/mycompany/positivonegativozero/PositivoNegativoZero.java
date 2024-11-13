/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.positivonegativozero;

import javax.swing.JOptionPane;

public class PositivoNegativoZero {
    public static void main(String[] args) {
        // Solicitar o número ao usuário
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");

        // Converter a entrada para inteiro
        int numero = Integer.parseInt(input);

        // Verificar se o número é positivo, negativo ou zero
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é POSITIVO.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é NEGATIVO.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é ZERO.");
        }
    }
}

