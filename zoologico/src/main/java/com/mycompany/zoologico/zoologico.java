/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author Admin
 */
public class zoologico {
    public static void main(String Args[]){
        //Criar diferentes animais
        Mamifero leao = new Mamifero("RF", 5, "Grande");
        
        //Exibir comportamentos
        leao.emitirSom(); //Saída
        
        leao.dormir();
    
    }
}
