/*
    4. Crie um ingresso.Peça para o usuário digitar 1 para normal e 2 para VIP.Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou VIP.
    Se for VIP, peça para ele digitar 1 para camarote superior e 2 para camarote inferior.
    Conforme a escolha do usuário, diga se que o VIP é camarote superior ou inferior. Imprima o valor do ingresso. 
 */
package com.mycompany.prj03092024;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */

//Classe Usuário
abstract class Usuario {
    //Atributos
    private String nome;
    private Integer ingresso;
    
    //Construtor
    public Usuario(String nome, Integer ingresso){
        this.nome = nome;
        this.ingresso = ingresso;
    }
    
    //Função para mostrar o valor do ingresso
    public void mostra_ingresso(){
        System.out.println(this.ingresso);
    }
    
    //Função que verifica se o ingresso é normal ou VIP
    public void func_ingresso(int n){
            n = Integer.parseInt(JOptionPane.showInputDialog("\n Parabéns, você é VIP! \n \n"
                + "Digite uma opção abaixo para escolher o camarote: \n"
                + "1 - Camarote superior"
                + "2 - Camarote inferior")); 
            
            switch(n){
                case 1:
                    JOptionPane.showMessageDialog(null, "Você escolheu o camarote superior");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Você escolheu o camarote inferior");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta");
            }
        }
    }
