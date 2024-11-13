import javax.swing.JOptionPane;

public class MaiorNumero {
    public static void main(String[] args) {
        // Solicitar os números ao usuário
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");

        // Converter as entradas para inteiros
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        // Comparar os números e exibir o resultado
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num1);
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais.");
        }
    }
}
