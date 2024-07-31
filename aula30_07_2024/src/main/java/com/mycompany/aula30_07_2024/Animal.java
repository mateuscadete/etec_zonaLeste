/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula30_07_2024;

/**
 *
 * @author Admin
 */
public class Animal {
    //Criação dos atributos
    public String especie;
    
    public int idade;
    
    public String alimentacao;
    
    //Criação do construtor
    public Animal(String especieInformadaAnimal,int idadeInformadaAnimal, 
            String alimentacaoInformadaAnimal){
        this.especie = especieInformadaAnimal;
        this.alimentacao = alimentacaoInformadaAnimal;
        this.idade = idadeInformadaAnimal;
    }

    //Criação do método da classe
    public void comer() {
        System.out.println("Animal comendo");
    }
    
}
