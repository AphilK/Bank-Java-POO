# Banco Digital Java - Desafio DIO

Este projeto é resultado de um desafio da [Digital Innovation One (DIO)](https://www.dio.me/) para criar um **banco digital** utilizando Java e os princípios de **Programação Orientada a Objetos (POO)**.

## Objetivo

Desenvolver um sistema bancário simples, com funcionalidades de criação de contas, autenticação de clientes, operações bancárias básicas e gerenciamento de contas, aplicando conceitos fundamentais de POO como abstração, encapsulamento, herança e polimorfismo.

## Funcionalidades

- **Criação de contas** (Corrente e Poupança)
- **Cadastro de clientes** com nome, CPF e senha
- **Autenticação** de acesso à conta
- **Depósito, saque e transferência** entre contas
- **Visualização de extrato**
- **Gerenciamento de contas** pelo banco

## Estrutura do Projeto

```
src/
└── org/aphilk/
    ├── model/
    │   ├── banco/
    │   │   └── Banco.java
    │   ├── cliente/
    │   │   └── Cliente.java
    │   └── conta/
    │       ├── Conta.java
    │       ├── ContaCorrente.java
    │       ├── ContaPoupança.java
    │       └── IConta.java
    └── view/
        └── App.java
```

- **Banco**: Gerencia as contas cadastradas.
- **Cliente**: Representa o usuário do banco.
- **Conta**: Classe abstrata base para contas bancárias.
- **ContaCorrente/ContaPoupança**: Especializações de Conta.
- **IConta**: Interface com operações bancárias.
- **App**: Interface de linha de comando para interação com o usuário.

## Como Executar

1. **Compile o projeto** (os arquivos `.class` serão gerados em `bin/`):

   ```sh
   javac -d bin src/org/aphilk/**/*.java
   ```

2. **Execute a aplicação**:

   ```sh
   java -cp bin org.aphilk.view.App
   ```

## Tecnologias Utilizadas

- Java 8+
- Orientação a Objetos
- Terminal/Console

## Sobre o Desafio

O desafio propõe a criação de um banco digital com operações básicas, reforçando o uso de boas práticas de POO e a estruturação de projetos Java.

---

Desenvolvido por **AphilK** para o bootcamp da DIO.
