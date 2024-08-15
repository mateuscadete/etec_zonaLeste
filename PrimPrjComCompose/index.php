<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Prim Proj Sem Composer</h1>
    <h3>Daqui a pouco a gente cria um projeto com composer</h3>
    <form action="index.php" method="get">
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome">
        <input type="submit" value="Enviar">
    <?php 
        echo $_GET['nome'];
    
    ?>
</body>
</html>