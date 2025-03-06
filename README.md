# Base Conhecimento API

<div align="center">
  <h3 align="center">API de Base de Conhecimento</h3>

  <p align="center">
    Uma API REST em Spring Boot para gerenciar uma base de conhecimento com artigos e autenticação de usuários
    <br />
  </p>
</div>

## Sobre o Projeto

Base Conhecimento é uma API RESTful construída com Spring Boot que fornece:

* Autenticação e autorização de usuários com JWT
* Gerenciamento de artigos com categorias
* Controle de acesso baseado em funções (papéis de ADMIN e USER)

O projeto segue práticas modernas de desenvolvimento e utiliza o Spring Security para uma robusta autenticação.

### Construído Com

* [![Spring][Spring]][Spring-url]
* [![Java][Java]][Java-url]
* [![Maven][Maven]][Maven-url]
* [![PostgreSQL][PostgreSQL]][PostgreSQL-url]
* [![JWT][JWT]][JWT-url]
* [![Docker][Docker]][Docker-url]

## Começando

Siga estas etapas para executar a API em seu ambiente local.

### Pré-requisitos

* JDK 11+
* Maven
* Docker e Docker Compose (para o banco de dados PostgreSQL)

### Instalação

1. Clone o repositório
   ```sh
   git clone https://github.com/seuusuario/base-conhecimento.git
   ```

2. Inicie o banco de dados PostgreSQL com Docker Compose
   ```sh
   docker-compose up -d
   ```

3. Construa o projeto com Maven
   ```sh
   mvn clean install
   ```

4. Execute a aplicação
   ```sh
   mvn spring-boot:run
   ```
   
5. A API estará disponível em:
   ```
   http://localhost:8080
   ```

## Documentação da API

### Endpoints de Autenticação

* **Registrar Usuário**: `POST /auth/register`
  ```json
  {
    "email": "usuario@exemplo.com",
    "password": "senha",
    "role": "USER"
  }
  ```

* **Login**: `POST /auth/login`
  ```json
  {
    "email": "usuario@exemplo.com",
    "password": "senha"
  }
  ```
  Retorna um token JWT para usar em requisições autenticadas

### Endpoints de Usuários

* **Obter Todos os Usuários**: `GET /users` (requer autenticação)

### Endpoints de Artigos

* **Obter Todos os Artigos**: `GET /articles` (requer autenticação)
* **Criar Artigo**: `POST /articles` (requer papel de USER)
  ```json
  {
    "title": "Título do Artigo",
    "content": "Conteúdo do artigo vai aqui",
    "categoryId": 1
  }
  ```

## Recursos de Segurança

A API implementa:
- Autenticação baseada em JWT
- Criptografia de senha usando BCrypt
- Autorização baseada em papéis (ADMIN e USER)
- Gerenciamento de sessão stateless

## Esquema do Banco de Dados

A aplicação usa PostgreSQL com as seguintes entidades principais:
- `users`: Armazena credenciais e papéis de usuário
- `articles`: Armazena artigos da base de conhecimento
- `categories`: Armazena categorias de artigos

## Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para enviar um Pull Request.

## Licença

Este projeto é open source e está disponível sob a Licença MIT.

<!-- MARKDOWN LINKS & IMAGES -->
[Spring]: https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white
[Spring-url]: https://spring.io/projects/spring-boot
[Java]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com/
[Maven]: https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white
[Maven-url]: https://maven.apache.org/
[PostgreSQL]: https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white
[PostgreSQL-url]: https://www.postgresql.org/
[JWT]: https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=json-web-tokens&logoColor=white
[JWT-url]: https://jwt.io/
[Docker]: https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white
[Docker-url]: https://www.docker.com/
