/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

/**
 * Criando a Classe Cachorro
 */
public class Cachorro extends Animal{
    //Construtor de objetos
    public Cachorro(String nome, String especie) {
        super(nome, especie);
    }
    
    //Método que faz o cachorro latir
    public void latir(){
        System.out.println("\n Au, au");
    
    }
    
    public void caminhar() {
        System.out.println("\n Caminhando");
    }
    
}
