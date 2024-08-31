/*
1 Crie um assistente administrativo e um técnico. Imprima o número de matrícula e o nome de cada um deles.
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
