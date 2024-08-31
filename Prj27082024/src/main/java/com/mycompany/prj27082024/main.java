/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj27082024;
import com.mycompany.prj27082024.Pessoa;
import com.mycompany.prj27082024.tecAdm;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String args[]){
        tecAdm tec1 = new tecAdm("Mateus", 18, "", 1234);
        tec1.getNome();
        tec1.getMatricula();
        
        assistenteAdm assistente1 = new assistenteAdm("Isaias", 14, "", 2316);
        assistente1.getNome();
        assistente1.getMatricula();
    }
}
