/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import javax.swing.JOptionPane;

public class ParOuImpar {
    public static void main(String[] args) {
        // Solicitar o número ao usuário
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");

        // Converter a entrada para inteiro
        int numero = Integer.parseInt(input);

        // Verificar se o número é par ou ímpar
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é PAR.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ÍMPAR.");
        }
    }
}
