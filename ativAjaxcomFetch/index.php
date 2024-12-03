<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Projeto AJAX com Fetch</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        #user-list {
            list-style-type: none;
            padding: 0;
        }
        .user {
            border: 1px solid #ddd;
            margin: 10px;
            padding: 10px;
            border-radius: 5px;
        }
        .loading {
            font-size: 20px;
            color: #888;
        }
    </style>
</head>
<body>
    <h1>Lista de Usuários</h1>
    <button id="load-users">Carregar Usuários</button>
    <p id="loading" class="loading" style="display: none;">Carregando...</p>
    <ul id="user-list"></ul>

    <script src="script.js"></script>
</body>
</html>
