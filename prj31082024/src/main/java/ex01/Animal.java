/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01;

/**
 * Criando a classe animal
 */
abstract class Animal {
    //Atributos
    private String nome;
    private String especie;

    //Contrutor de objetos
    public Animal(String nome, String especie) {
        this.nome = nome;
    }
    
    //Métodos
    
    //Método para alterar o nome do animal
    public void getNome(String Snome) {
        this.nome = Snome;
    }

    //Método para mostrar a espécie
    public void getEspecie(String Sespecie) {
        this.especie = Sespecie;
    }

}
