package br.com.etec_zl.prj_etec_java.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/aluno")
public class AlunoController {
    @RequestMapping("/findByName")
    public String findByName(@RequestParam String nome) {
        return "Olá " + nome;
    }

    @GetMapping("/get/{id}")
    public String getMethodName(@PathVariable("id") String param) {
            return "id para pegar o usuario foi " + param;
    }

}
