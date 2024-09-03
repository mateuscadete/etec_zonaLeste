/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj03092024;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String args[]){
    int n;
    int n2 = 0;

    n  = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção abaixo para escolher o tipo de ingresso: \n"
            + "1 - Ingresso normal."
            + "\n 2 - Ingresso VIP"));

    switch (n) {
        case 1:
            JOptionPane.showMessageDialog(null, "Você escolheu o ingresso normal");
            break;
        case 2:
            JOptionPane.showMessageDialog(null,"\n Parabéns, você é VIP! \n \n"
                + "Digite uma opção abaixo para escolher o camarote: \n"
                + "1 - Camarote superior"
                + "2 - Camarote inferior"); 
            
            switch(n2){
                case 1:
                    JOptionPane.showMessageDialog(null, "Você escolheu o camarote superior");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Você escolheu o camarote inferior");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta");
            }
            break;
        default:
            JOptionPane.showMessageDialog(null, "Opção incorreta");
    }
 }
    
}
