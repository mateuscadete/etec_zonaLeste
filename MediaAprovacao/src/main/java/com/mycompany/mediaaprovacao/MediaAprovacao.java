/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaaprovacao;

import javax.swing.JOptionPane;

public class MediaAprovacao {
    public static void main(String[] args) {
        // Solicitar as notas ao usuário
        String input1 = JOptionPane.showInputDialog("Digite a primeira nota:");
        String input2 = JOptionPane.showInputDialog("Digite a segunda nota:");
        String input3 = JOptionPane.showInputDialog("Digite a terceira nota:");

        // Converter as entradas para double
        double nota1 = Double.parseDouble(input1);
        double nota2 = Double.parseDouble(input2);
        double nota3 = Double.parseDouble(input3);

        // Calcular a média
        double media = (nota1 + nota2 + nota3) / 3;

        // Verificar se o aluno foi aprovado ou reprovado
        String resultado = media >= 6.0 ? "Aprovado" : "Reprovado";

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "Média: " + media + "\nStatus: " + resultado);
    }
}
