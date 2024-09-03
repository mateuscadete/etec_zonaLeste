/*
    Crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho. 
    Conforme a definição do usuário, imprima o valor final do imóvel.

 */
package ex05;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n Escolha uma opção abaixo: "
                + "\n 1 - Imóvel novo."
                + "\n 2 - Imóvel velho. \n");
        
        int numero = scanner.nextInt();
                
        if(numero == 1){
            System.out.println("Imóvel novo");
        
        }else{
            System.out.println("Imóvel velho");
        }
    }
}
