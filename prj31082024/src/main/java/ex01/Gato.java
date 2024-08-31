/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

/**
 *Criando a classe Gato
 */
public class Gato extends Animal{
    //Contrutor de objetos
    public Gato(String nome, String especie) {
        super(nome, especie);
    }
    
    //Método que faz o gato miar
    public void miar(){
        System.out.println("\n Miau, miau");
    }
    
    public void caminhar() {
        System.out.println("\n Caminhando");
    }
}
