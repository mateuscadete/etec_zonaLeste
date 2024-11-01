<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    // Obtém o nome enviado via AJAX
    $name = htmlspecialchars($_POST['name']);
    
    // Responde com uma saudação
    echo "Olá, " . $name . "! Bem-vindo ao nosso site.";
} else {
    echo "Método não permitido.";
}
?>
