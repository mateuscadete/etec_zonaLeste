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
    int matricula;

    public Aluno(int matricula, String nome, int idade) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public int getId() {
        return this.matricula;
    }

    @Override
    public void atividade() {
        System.out.println("Frequentando aulas e praticando instrumentos");
    }
    
}
