# Calculadora GUI em Java

Este é um projeto de uma calculadora simples com interface gráfica (GUI) desenvolvida em Java utilizando a biblioteca Swing. O objetivo deste projeto é fornecer uma calculadora funcional para operações aritméticas básicas e servir como um exemplo prático de desenvolvimento de GUI em Java para fins de aprendizado e portfólio.

## Funcionalidades

A calculadora suporta as seguintes operações aritméticas básicas:
- Adição (+)
- Subtração (-)
- Multiplicação (*)
- Divisão (/)
- Limpar entrada (C)
- Suporte a números decimais (.)

## Tecnologias Utilizadas

- **Java:** Linguagem de programação principal.
- **Swing:** Biblioteca Java para criação de interfaces gráficas de usuário.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
JavaCalculatorGUI/
├── src/
│   └── com/
│       └── calculator/
│           ├── gui/
│           │   └── CalculatorGUI.java  // Contém a lógica da interface gráfica e das operações
│           └── main/
│               └── Main.java           // Classe principal para iniciar a aplicação
└── README.md                       // Este arquivo
```

## Como Compilar e Executar

Para compilar e executar este projeto, você precisará ter o JDK (Java Development Kit) instalado em sua máquina.

1.  **Navegue até o diretório `src` do projeto:**
    Abra um terminal ou prompt de comando e navegue até a pasta `src` dentro do diretório raiz do projeto (`JavaCalculatorGUI/src`).

2.  **Compile os arquivos Java:**
    Execute o seguinte comando para compilar os arquivos `.java`:
    ```bash
    javac com/calculator/main/Main.java com/calculator/gui/CalculatorGUI.java
    ```
    Isso irá gerar os arquivos `.class` correspondentes dentro das suas respectivas estruturas de pacotes.

3.  **Execute a aplicação:**
    Ainda no diretório `src`, execute o seguinte comando para iniciar a calculadora:
    ```bash
    java com.calculator.main.Main
    ```
    A interface gráfica da calculadora deverá aparecer.

## Como Usar

- Clique nos botões numéricos para inserir os números.
- Clique nos botões de operação (+, -, *, /) para selecionar a operação desejada.
- Clique no botão "=" para ver o resultado da operação.
- Clique no botão "C" para limpar a entrada atual e o display.
- O ponto "." pode ser usado para inserir números decimais.

## Possíveis Melhorias Futuras

- Adicionar mais operações (ex: porcentagem, raiz quadrada, potência).
- Implementar histórico de cálculos.
- Melhorar o tratamento de erros e entradas inválidas.
- Permitir o uso do teclado para entrada de dados.
- Refinar o design da interface gráfica.

Divirta-se usando e explorando o código!

