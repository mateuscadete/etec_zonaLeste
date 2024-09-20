/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sis_gestaoescolamusica;

/**
 *
 * @author Admin
 */
public class Funcionario extends Pessoa implements Identificavel{
    int cracha;

    public Funcionario(int cracha, String nome, String idade) {
        super(nome, idade);
        this.cracha = cracha;
    }
      
    @Override
    public int getId() {
        return this.cracha;
    }

    @Override
    public void atividade() {
        System.out.println("Realizando tarefas administrativas");
    }
    
    
}
