/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02;

/**
 *
 * @author mateu
 */
abstract class Pessoa {
    private String nome;
    private Integer idade;
    private String status;
    
    Pessoa(String nome, Integer idade, String status){
        this.nome = nome;
        this.idade = idade;
        this.status = status;
    }
    
    public void getNome(){
        System.out.println("Seu nome e: " + this.nome);
    }
    
    public void getIdade(){
        System.out.println("Sua idade e: " + this.idade);
    }
    
    public void getStatus(){
        if (this.status == "Rica") {
            System.out.println("Parabens voce e VIP");
            
        }else if(this.status == "Pobre"){
            System.out.println("Entregue a passagem");
            
        }else if(this.status == "Miseravel"){
            System.out.println("De o fora daqui!");
            
        }
        
    }
    
}
