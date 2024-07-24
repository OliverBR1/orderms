## Desafio Btg-Pactual

## :rocket: Tecnologias utilizadas
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
![RabbitMQ](https://img.shields.io/badge/RabbitMQ-%23ED8B00.svg?style=for-the-badge&logo=rabbitmq&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-%23007799.svg?style=for-the-badge&logo=docker&logoColor=white)

# Escopo do desafio backend
Construir um microserviço que seja capaz de:
* Processar pedidos a partir de uma fila RabbitMq
* Criar uma API Rest que permita consultar:
  * Valor total de um pedido;
  * Quantidade de pedidos por cliente;
  * Lista de pedidos realizados por cliente.

## Instalação

1. Copie o repositório:

```bash
git clone https://github.com/OliverBR1/orderms.git
```

2. Instalar dependências do Maven

Crie uma configuração de conexão com o banco de dados no arquivo `application.properties`

```yaml
spring.application.name=orderms

spring.data.mongodb.authentication-database=admin
spring.data.mongodb.auto-index-creation=true
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=btgpactualdb
spring.data.mongodb.username=admin
spring.data.mongodb.password=123
```

**Mongo**

   **Obs**:
   Não se esqueça de verificar se está na pasta correta do arquivo "local"
1. Digite no terminal:
```bash
docker compose up -d
```



2. Crie um Banco de dados no mongo utilizando mongo express: http://localhost:27017.

3. Logue com suas credencias e crie um banco de dados com o nome de sua preferência EX:  'btg-pactual'.
