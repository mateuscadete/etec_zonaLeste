package ex01;

/*
    Crie um animal do tipo cachorro e faça-o latir. 
    Crie um gato e faça-o miar. Faça os dois animais caminharem.
 */


public class main {
   public static void main(String args[]){
       //Criando o objeto da Classe Cachorro
       Cachorro dog1 = new Cachorro("Scooby", "Canino");
       dog1.latir();
       
       //Criando o objeto da Classe Gato
       Gato cat1 = new Gato("Lilly", "Felino");
       cat1.miar();
      
       dog1.caminhar();
       cat1.caminhar();
  
   }
}
