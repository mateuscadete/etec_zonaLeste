/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj01102024;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String args[]) {
        int opc = 0;

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Exception 1.\n"
                    + "2 - Exception 2. \n"
                    + "9 - Sair do programa."));

            switch (opc) {
                case 1:
                    try {
                    testeException1 p1 = new testeException1(5);
                    p1.exception1(1);

                } catch (ArithmeticException e) {
                    System.out.println("Erro de divisão por zero: " + e.getMessage());
                }
                break;

                case 2:
                    testeException2 p2 = new testeException2();
                    p2.exception2();
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                    break;
            }
        }

    }
}
