/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sis_gestaoescolamusica;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String args[]) {
        // Criando o vetor para armazenar os dados
        String[] Vetor = new String[3];

        // Opção digitada pelo usuário
        int opc = 4;

        // Iniciando a função scanner para capturar valores pelo terminal
        Scanner scanner = new Scanner(System.in);

        // Enquanto opc diferente de 0, o usuário pode escolher uma classe para atribuir
        // conteúdo
        while (opc != 0) {
            System.out.println("Escolha a opcao desejada: \n"
                    + "1- Cadastrar aluno. \n"
                    + "2 - Cadastrar professor.  \n"
                    + "3 - Cadastrar funcionario. \n"
                    + "0 - Para sair do programa");

            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    // Instanciando a classe aluno
                    Aluno a1 = new Aluno(Vetor[0], Vetor[1], Vetor[2]);

                    // Mensagem ao usuário
                    System.out.println("\n Digite a matricula, nome e idade do aluno: ");

                    // Capturando valores digitados no terminal
                    a1.matricula = scanner.nextLine();
                    a1.nome = scanner.nextLine();
                    a1.idade = scanner.nextLine();

                    // Atribuindo valores ao Array
                    Vetor[0] = a1.matricula;
                    Vetor[1] = a1.nome;
                    Vetor[2] = a1.idade;

                    // Funções para mostrar o conteúdo do array e ativiade do aluno,
                    // respectivamente.
                    mostraValores(Vetor);
                    a1.atividade();
                    break;

                case 2:
                    // Instanciando a classe Professor
                    Professor p1 = new Professor(Vetor[0], Vetor[1], Vetor[2]);

                    // Mensagem ao usuário
                    System.out.println("\n Digite o registro, nome e idade do professor: ");

                    // Capturando valores digitados no terminal
                    p1.registro_funcional = scanner.nextLine();
                    p1.nome = scanner.nextLine();
                    p1.idade = scanner.nextLine();

                    // Atribuindo valores ao Array
                    Vetor[0] = p1.registro_funcional;
                    Vetor[1] = p1.nome;
                    Vetor[2] = p1.idade;

                    // Funcão para mostrar o conteúdo do array e atividade do aluno, respectivamente
                    mostraValores(Vetor);
                    p1.atividade();
                    break;

                case 3:
                    // Instanciando a classe Funcionario
                    Funcionario f1 = new Funcionario(Vetor[0], Vetor[1], Vetor[2]);

                    // Mensagem ao Usuario
                    System.out.println("\n Digite o nº do cracha, nome e idade do funcionario: ");

                    // Capturando valores digitados no terminal
                    f1.cracha = scanner.nextLine();
                    f1.nome = scanner.nextLine();
                    f1.idade = scanner.nextLine();

                    // Atribuindo valores ao Array
                    Vetor[0] = f1.cracha;
                    Vetor[1] = f1.nome;
                    Vetor[2] = f1.idade;

                    // Funcão para mostrar o conteúdo do array e atividade do aluno, respectivamente
                    mostraValores(Vetor);
                    f1.atividade();
                break;
            }
        }

    }

    // Função para mostrar o conteúdo do Array
    public static String[] mostraValores(String[] v) {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n" + v[i]);
        }
        return v;
    }
}
