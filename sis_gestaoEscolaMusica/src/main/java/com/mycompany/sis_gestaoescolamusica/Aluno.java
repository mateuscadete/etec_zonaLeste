/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sis_gestaoescolamusica;

/**
 *
 * @author Admin
 */
public class Aluno extends Pessoa implements Identificavel{
    String matricula;

    public Aluno(String matricula, String nome, String idade) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public String getId() {
        return this.matricula;
    }

    @Override
    public void atividade() {
        System.out.println("Frequentando aulas e praticando instrumentos");
    }
    
}
