# Multiples

Este projeto contém uma solução em Java para o problema de soma de múltiplos de 3 e 5.

## Descrição

O objetivo do algoritmo é, dado um número inteiro, retornar a soma de todos os números naturais abaixo desse número que sejam múltiplos de 3 ou 5.

Por exemplo, se listarmos todos os números naturais abaixo de 10 que são múltiplos de 3 ou 5, obtemos 3, 5, 6 e 9. A soma desses múltiplos é 23.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **`src/main/java/com/multiples/App.java`**: Classe principal da aplicação (Ponto de entrada).
- **`src/main/java/com/multiples/Solution.java`**: Classe que contém a lógica do desafio no método `solution`.

## Como Usar

Você pode instanciar a classe `Solution` e chamar o método `solution` passando o número limite desejado:

```java
Solution sol = new Solution();
int resultado = sol.solution(10); // Retorna 23
```