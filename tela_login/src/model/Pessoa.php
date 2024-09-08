<?php
    
    namespace App\model;

    class Pessoa{
        private $nome;
        private $senha;

        function __construct($nome, $senha) {
            $this->nome = $nome;
            $this->senha = $senha; 
        }

        public function getNome() {
            return $this->nome;

        }

        public function getSenha() {
            return $this->senha;
        }



    }