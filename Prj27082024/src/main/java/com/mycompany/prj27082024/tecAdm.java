/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj27082024;

/**
 *
 * @author mateu
 */
public class tecAdm extends Pessoa{
    private Integer matricula;
    
    public tecAdm(String nome, Integer idade, String nomeSocial, Integer matricula) {
        super(nome, idade, nomeSocial);
        this.matricula = matricula;
    }
    
    public void getMatricula(){
        System.out.println("O número e: " + matricula);
    } 
    
    public void setMatricula(int nMatricula){
        this.matricula = nMatricula;
    }
}
