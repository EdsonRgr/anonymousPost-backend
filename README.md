# Anonymous Post - Aplicação Back-End

## Esta é uma aplicação back-end construída com Java Spring Boot 21 e PostgreSQL 16.2. A aplicação permite a criação, leitura, atualização e exclusão de postagens anônimas.

Classe Post:

A classe Post possui os seguintes atributos:
```bash
id;
String nomedousuario;
String texto;
String urlimg;
Date dataCriacao;
Date dataAlteracao;
boolean desativado;
Date dataDesativacao;
```
Metodos:
```bash
Post();
updatePost();
desativaPost();
```


## Configuração
Para clonar e executar esta aplicação, você precisará do Git, JDK 11 e Maven instalados em seu computador. No seu terminal:
```bash
# Clone este repositório
$ git clone <url-do-repositorio>

# Entre no repositório
$ cd nome-do-repositorio

# Instale as dependências
$ mvn install

# Execute a aplicação
$ mvn spring-boot:run
``` 
## Banco de Dados
Esta aplicação utiliza o PostgreSQL 16.2. Certifique-se de que você tem o PostgreSQL instalado e configurado corretamente em sua máquina. Você pode precisar atualizar o arquivo application.properties com suas credenciais do PostgreSQL.

## API Endpoints
A aplicação expõe os seguintes endpoints:

POST /posts: Cria uma nova postagem.
GET /posts: Retorna todas as postagens.
PUT /posts/update: Atualiza uma postagem recebendo o body.
PUT /posts/desativa{id}: Desativa uma postagem pelo ID.
DELETE /posts/delete/{id}: Exclui uma postagem pelo ID.
