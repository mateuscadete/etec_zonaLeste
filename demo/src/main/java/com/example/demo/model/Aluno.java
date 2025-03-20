package com.example.demo.model;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Aluno {
    @NotNull (message = "O id não pode ser nulo")
    @NotBlank (message = "O id não pode ser vazio")
    private Integer id;

    @NotNull (message = "O nome não pode ser nulo")
    @NotBlank (message = "O nome não pode ser vazio")
    private String nome;

    @NotNull (message = "A idade não pode ser nula")
    @NotBlank  (message = "A idade não pode ser vazia")
    private Integer idade;

    @CPF (message = "O CPF não é válido")
    @NotNull (message = "O CPF não pode ser nulo")
    @NotBlank (message = "O CPF não pode ser vazio")
    private String cpf;

        public Aluno(Integer id, String nome, Integer idade){
            this.id = id;
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome;

        }

        public Integer getIdade(){
            return idade;
        }

        public void setIdade(Integer idade){
            this.idade = idade;
        }

        public String cpf(){
            return cpf;
        }

        public void setCpf(String cpf){
            this.cpf = cpf;
        }
}
