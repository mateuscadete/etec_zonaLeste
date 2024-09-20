/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sis_gestaoescolamusica;

/**
 *
 * @author Admin
 */
abstract class Pessoa {
    //Atributos
    String nome;
    String idade;

    //Construtor
    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Método
    public void atividade(){};
       
}
