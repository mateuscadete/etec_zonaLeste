/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj27082024;

/**
 *
 * @author Admin
 */
abstract class Pessoa {
    private String nome;
    private Integer idade;
    public String nomeSocial;
    
    public Pessoa(String nome, Integer idade, String nomeSocial){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void getNome(){
        System.out.println("O número e: " + nome);
    }
    
    public void getIdade(){
        System.out.println("O número e: " + idade);
    }
    
    public void getnomeSocial(){
        System.out.println("O número e: " + idade);
    }
    
    public void setnomeSocial(String nSocial){
        this.nomeSocial = nSocial;
    }
}
