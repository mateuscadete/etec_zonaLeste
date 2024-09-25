<?php
    require_once __DIR__ . "/../vendor/autoload.php";

    use App\model\Usuario;

    $uAda = new Usuario();
    $uAda->nome = "Ada Lovelace";

    echo print_r(value: $uAda, return: true);