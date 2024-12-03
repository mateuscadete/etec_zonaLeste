document.getElementById('load-users').addEventListener('click', loadUsers);

function loadUsers() {
    const userList = document.getElementById('user-list');
    const loadingMessage = document.getElementById('loading');

    // Exibir mensagem de carregando
    loadingMessage.style.display = 'block';
    userList.innerHTML = '';

    // Fazer a requisição para a API usando Fetch
    fetch('https://jsonplaceholder.typicode.com/users')
        .then(response => {
            // Verificar se a resposta foi bem-sucedida
            if (!response.ok) {
                throw new Error('Erro ao carregar os dados');
            }
            return response.json();
        })
        .then(users => {
            // Esconder a mensagem de carregamento
            loadingMessage.style.display = 'none';

            // Popular a lista de usuários
            users.forEach(user => {
                const li = document.createElement('li');
                li.className = 'user';
                li.innerHTML = `
                    <strong>${user.name}</strong><br>
                    <span>Email: ${user.email}</span><br>
                    <span>Endereço: ${user.address.street}, ${user.address.city}</span>
                `;
                userList.appendChild(li);
            });
        })
        .catch(error => {
            // Esconder a mensagem de carregamento e exibir erro
            loadingMessage.style.display = 'none';
            userList.innerHTML = `<li><strong>Erro ao carregar os dados: ${error.message}</strong></li>`;
        });
}
