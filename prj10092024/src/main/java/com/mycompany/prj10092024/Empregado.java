/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj10092024;

/**
 *Criação da classe Empregado
 */
public abstract class Empregado {
    //Atributos
    private String nome;
    private String familia;
    
    //Construtor
    public Empregado(String nome, String familia){
        this.nome = nome;
        this.familia = familia;
    }
    
    //Métodos
    
    //Retorna o conteúdo do atributo nome
    public String getNome(){
        return this.nome;
    
    }
    
    //Retorna o conteúdo do atributo familia
    public String getFamilia(){
        return this.familia;
    }
    
    //Método ganhar
    public abstract double ganhar();
}
