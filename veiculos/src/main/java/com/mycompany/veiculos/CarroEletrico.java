/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculos;

/**
 *
 * @author Admin
 */
public class CarroEletrico extends Carro {
    //Atributo específico da classe CarroEletrico
    private float capacidadeBateria;
    
    //Método construtor para receber os mesmos atributos da classe Carro
    public CarroEletrico(String modelo, String marca, int ano, float capacidadeBateria){
        capacidadeBateria = capacidadeBateria;
        
    }
    
    //Método específico para carregar a bateria do veículo
    public void carregarBateria(){
        System.out.println("Bateria carregando");
    }
    
    //Método acelerar
    public void acelerar(){
        System.out.println("Acelerando");
        
    }
}
