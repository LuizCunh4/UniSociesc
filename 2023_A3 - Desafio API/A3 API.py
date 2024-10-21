import requests

# urls da API
urlLogin = "http://137.184.108.252:5000/api/login"
urlCidades = "http://137.184.108.252:5000/api/cidades"

# Fazendo login para gerar token
# Login e senha
dados = {
    "email": "polak00two@hotmail.com",
    "password": "Ro22KbnnIZa2"
}

# Fazendo a requisição POST
response = requests.post(urlLogin, json=dados)

# Verifica se o login foi efetuado e gera o token
if response.status_code == 200:
    print("Login realizado com sucesso!")
    token = response.json().get('token')
    print(f"token gerado: {token}")
else:
    print(f"Erro ao enviar dados: {response.status_code}")

# Usando o token para pegar as cincos cidades
# Passando o token no header do Get
headers = {
    "x-access-token": token
}

# Fazendo a requisição GET
response = requests.get(urlCidades, headers=headers)

# Verifica o status da resposta
if response.status_code == 200:
    cidades = response.json()

    # Criando uma lista com as cinco cidades
    lista_cidades = [cidades]

    # Gerando uma lista em HTML
    html_content = """
    <!DOCTYPE html>
    <html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cidades</title>
        <style>
            table {
                width: 50%;
                border-collapse: collapse;
                margin: 25px 0;
                font-size: 18px;
                text-align: left;
            }
            table, th, td {
                border: 1px solid #dddddd;
                padding: 8px;
            }
            th {
                background-color: #f2f2f2;
            }
        </style>
    </head>
    <body>
        <h1>Lista de Cidades</h1>
        <table>
            <tr>
                <th>Código</th>
                <th>Nome</th>
            </tr>
    """

    # Adicionando as cidades como linhas da tabela no HTML
    for cidade in cidades:
        html_content += f"<tr><td>{cidade['id']
                                   }</td><td>{cidade['nome']}</td></tr>\n"

    # Fechando as tags HTML
    html_content += """
        </table>
    </body>
    </html>
    """

    # Salvando o conteúdo HTML em um arquivo
    with open("cidades.html", "w", encoding="utf-8") as file:
        file.write(html_content)

    print("Arquivo HTML gerado com sucesso!")

else:
    print(f"Erro na requisição: {response.status_code}")
