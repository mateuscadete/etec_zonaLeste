/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sis_gestaoescolamusica;

/**
 *
 * @author Admin
 */
public class Professor extends Pessoa implements Identificavel{
    int registro_funcional;

    public Professor(int registro_funcional, String nome, int idade) {
        super(nome, idade);
        this.registro_funcional = registro_funcional;
    }
    
    @Override
    public void atividade() {
        System.out.println("Ministrando aulas de música");
    }

    @Override
    public int getId() {
       return this.registro_funcional;
    }
    
    
}
