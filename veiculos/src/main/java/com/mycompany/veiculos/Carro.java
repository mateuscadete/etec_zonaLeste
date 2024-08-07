/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculos;

/**
 *
 * @author Admin
 */
public class Carro extends Veiculo{
    //Atributo específico da classe carro
    private String tipoDeCombustivel;
    
    //Método contrutor para receber os atributos da classe Veiculos
    public Carro(String marca, String modelo, int ano, String tipoDeCombustivel){
        this.tipoDeCombustivel = tipoDeCombustivel;
    
    }

    //Método acelerar
    public void acelerar(){
        System.out.println("Acelerando");
    }
    
    //Método frear
    public void frear(){
        System.out.println("Freando");
        
    }
    
}