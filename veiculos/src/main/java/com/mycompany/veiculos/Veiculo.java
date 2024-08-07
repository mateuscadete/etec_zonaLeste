/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculos;

/**
 *
 * @author Admin
 */
abstract class Veiculo {
    //Declaração de variáveis
    protected String marca;
    protected String modelo;
    protected int ano;
    
    //Criação do método contrutor
    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    //Método acelerar
    public abstract void acelerar();
    
    public abstract void frear();
    
}
