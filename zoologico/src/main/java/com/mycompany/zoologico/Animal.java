/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author Admin
 */
abstract class Animal {
    
    //Declaração de variáveis
    protected String nome;
    protected int idade;
    
    //Criação do método contrutor
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    //Método emitir som
    public abstract void emitirSom();
    
    //Método dormir
    public abstract void dormir();
}
