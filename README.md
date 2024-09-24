# Workshop SpringBoot + MongoDB

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/joaov7r/workshop-spring-boot-mongodb/blob/main/LICENSE) 

# Sobre o projeto

O **workshop-spring-boot-mongodb** é uma aplicação web desenvolvida como parte de um workshop de Spring Boot, com foco na implementação de APIs RESTful utilizando o banco de dados NoSQL MongoDB. A aplicação visa mostrar como trabalhar com Spring Data MongoDB para persistência e manipulação de dados.

## Modelo conceitual
![Modelo Conceitual](https://github.com/joaov7r/assets/blob/main/pics/domain-model-springb-mongodb.png)

# Tecnologias utilizadas

- Java 17
- Spring Boot 
- Maven

# Banco de dados

- MongoDB (Desenvolvimento e Produção)

# Instruções sobre o banco de dados:

- A aplicação utiliza o MongoDB como banco de dados tanto em ambientes de desenvolvimento quanto em produção.
- Para o desenvolvimento local, certifique-se de que o MongoDB está rodando na sua máquina.

# Como executar o projeto

## Pré-requisitos

- Java 17
- Maven
- MongoDB (instalado e configurado localmente)

## Passos para execução local

### 1. Iniciar o servidor MongoDB

Antes de rodar o projeto, é necessário iniciar o servidor MongoDB localmente. Para isso, execute o comando abaixo no terminal:

```bash
# Iniciar o MongoDB
mongod

# Clonar o repositório
git clone https://github.com/joaov7r/workshop-spring-boot-mongodb

# Navegar até o diretório do projeto
cd workshop-spring-boot-mongodb

# Executar o projeto 
./mvnw spring-boot:run
```

# Autor

João Vitor Cordeiro Lopes

https://www.linkedin.com/in/joaovitorcl
