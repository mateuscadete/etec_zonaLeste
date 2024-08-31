/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02;

/**
 *
 * @author mateu
 */
public class main {
    public static void main(String args[]){
        Rica p1 = new Rica("Tio Patinhas", 34, "Rica"); 
        Pobre p2 = new Pobre("Zezinho", 40, "Pobre"); 
        Miseravel p3 = new Miseravel("Luizinho", 20, "Miseravel");
        
        p1.getNome();
        p1.getIdade();
        p1.getStatus();
        
        p2.getNome();
        p2.getIdade();
        p2.getStatus();
        
        p3.getNome();
        p3.getIdade();
        p3.getStatus();
    }
}
