/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author Admin
 */
//Classe mamífero
class Mamifero extends Animal{
    private String tipoDePelo;
    
    public Mamifero(String nome, int idade, String tipoDePelo){
        super(nome, idade);
        this.tipoDePelo = tipoDePelo;        
        
    }
        
    //Metodos comuns
    @Override
    public void emitirSom() {
        System.out.println(nome + "O animal está emitindo som.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + "está dormindo");
    }
    
    
   
    
}
