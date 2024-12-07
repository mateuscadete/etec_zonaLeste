<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo de AJAX com JavaScript</title>
    <script>
        // Função para fazer a requisição AJAX
        function carregarDados() {
            // Criação do objeto XMLHttpRequest
            var xhr = new XMLHttpRequest();

            // Definir o tipo de requisição (GET ou POST), a URL e se deve ser assíncrona
            xhr.open("GET", "dados.php", true);

            // Definir o que fazer quando a requisição estiver completa
            xhr.onload = function() {
                if (xhr.status >= 200 && xhr.status < 300) {
                    // Sucesso: exibir os dados na página
                    document.getElementById("resultado").innerHTML = xhr.responseText;
                } else {
                    // Caso haja erro na requisição
                    console.error("Erro na requisição: " + xhr.status);
                }
            };

            // Enviar a requisição
            xhr.send();
        }
    </script>
</head>
<body>

    <h1>Exemplo de AJAX com JavaScript</h1>
    <button onclick="carregarDados()">Carregar Dados</button>

    <div id="resultado">
        <!-- O resultado da requisição será exibido aqui -->
    </div>

</body>
</html>
