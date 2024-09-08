<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário</title>
</head>
<body>
    <h1>Formulário</h1>
    <form action="index.php" method="post">
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome" required>
        <br>
        <br>
        <label for="senha">Senha:</label>
        <input type="password" name="senha" id="senha" required>
        <br>
        <br>
        <input type="submit" name="submit" value="Enviar">

    </form>

    <?php
            include(__DIR__."/../vendor/autoload.php");
            //Importa a classe Pessoa
            use App\model\Pessoa;

            //Declara as variáveis que armazenarão o conteúdo nome e senha
            $nome = $_GET('nome');
            $senha = $_GET('senha');
            
            //Condição que verifica se o formulário foi enviado
            if($_SERVER['REQUEST_METHOD'] = "POST"){

                //Criando o objeto pessoa que recebe o conteúdo das variáveis nome e senha
                $p1 = new Pessoa($nome, $senha);

                /*
                    Condição para exibir a mensagem na tela quando o atributo nome da classe Pessoa é igual à admin
                    e a o atributo da senha é igual a admin123
                */
                if($p1->getNome() == "admin" && $p1->getSenha() == "admin123"){
                    echo"<h2>Parabéns, você está logado!<h2>";

                }else{
                    echo"<h2>Usuário e/ou senha incorretos.</h2>";

                }

            }else{
                echo"<h2>Por favor envie o formulário!<h2>";
            }

            
        ?>
</body>
</html>