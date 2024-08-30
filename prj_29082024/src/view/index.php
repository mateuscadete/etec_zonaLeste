<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="src\view\myScript.js"></script>
    <title>Document</title>
</head>
<body>
    <!-- Fromulário que recebe o nome do usuário e senha-->
    <h1>Formulário</h1>
    
    <form action="src\view\index.php">
        <label for="usuario">Usuário:</label>
        <input type="text" name="usuario" id="usuario">
        <label for="senha">Senha:</label>
        <input type="password" name="senha" id="senha">
        <button type="submit" name="submit" value="btEnviar">Enviar</button>
        <?php 
            $usuario = $_POST['usuario'];
            echo"<h2>Olá, $usuario</h2>";
            $senha = $_POST['senha'];
            echo"<h2>Senha: $senha</h2>";
        ?>
    </form>
    
    <br>
    
</body>
</html>