package com.example.demo.restservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Aluno;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
public class AlunosRestServices {
    @GetMapping("/alunos")
    public List<Aluno> getAlunos(){
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno(1, "João", 15));
        alunos.add(new Aluno(2, "Maria", 16));
        alunos.add(new Aluno(3, "José", 17));
        return alunos;
    }

    @PostMapping("/alunos")
    public Aluno inserirAluno(@RequestBody @Valid Aluno aluno) {
        System.out.println("Aluno inserido: " + aluno);
        return aluno;
    }
    
}
