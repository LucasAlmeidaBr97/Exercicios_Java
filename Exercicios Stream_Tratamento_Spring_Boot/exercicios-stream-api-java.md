# Exercícios Stream API Java

Este documento contém uma série de exercícios práticos organizados por níveis de dificuldade para o aprendizado e fixação dos conceitos da **Stream API** do Java.

---

## Nível 1 - Básico

### Exercício 1 - Filtrar números pares
Dada a lista:
```java
List<Integer> numeros = Arrays.asList(3, 8, 15, 22, 9, 14, 30, 11);
```
Retorne apenas os números pares.

**Métodos esperados:**
* `stream()`
* `filter()`
* `collect()`

---

### Exercício 2 - Converter para maiúsculas
```java
List<String> nomes = Arrays.asList(
    "Lucas",
    "Ana",
    "Carlos",
    "Maria"
);
```
Retorne uma lista contendo todos os nomes em maiúsculo.

---

### Exercício 3 - Dobrar os valores
```java
List<Integer> numeros = Arrays.asList(2, 4, 6, 8);
```
**Resultado esperado:**
```text
4
8
12
16
```

---

### Exercício 4 - Contar elementos
Conte quantos nomes existem na lista:
```java
List<String> nomes = Arrays.asList(
    "João",
    "Pedro",
    "Lucas",
    "Maria",
    "José"
);
```

---

### Exercício 5 - Ordenar números
Ordene a lista abaixo em ordem crescente:
```java
List<Integer> numeros = Arrays.asList(
    10, 3, 7, 2, 40, 15
);
```
Depois, faça o mesmo para ordenar em ordem decrescente.

---

## Nível 2 - Intermediário

### Exercício 6 - Filtrar nomes grandes
Retorne apenas nomes com mais de 5 letras:
```java
List<String> nomes = Arrays.asList(
    "Lucas",
    "Amanda",
    "José",
    "Fernanda",
    "Ana"
);
```

---

### Exercício 7 - Soma
Some todos os números da lista:
```java
List<Integer> numeros = Arrays.asList(
    5, 10, 15, 20
);
```
**Resultado esperado:** `50`

---

### Exercício 8 - Média
Calcule a média dos valores:
```java
List<Double> notas = Arrays.asList(
    8.5,
    7.0,
    9.5,
    6.0
);
```

---

### Exercício 9 - Encontrar o maior número
```java
List<Integer> numeros = Arrays.asList(
    4,
    18,
    3,
    90,
    12
);
```

---

### Exercício 10 - Encontrar o menor número
Utilize a mesma lista do exercício anterior para encontrar o menor número.

---

### Exercício 11 - Remover duplicados
```java
List<Integer> numeros = Arrays.asList(
    1, 2, 3, 2, 4, 5, 3, 6
);
```
**Resultado esperado:**
```text
1 2 3 4 5 6
```

---

### Exercício 12 - Primeiros 3 elementos
Retorne apenas os três primeiros elementos da lista.

---

### Exercício 13 - Ignorar os 2 primeiros
Utilize o método:
* `skip()`

---

### Exercício 14 - Existe algum maior que 100?
```java
List<Integer> numeros = Arrays.asList(
    20,
    35,
    70,
    105,
    8
);
```
Retorne um valor `boolean`.

---

### Exercício 15 - Todos são positivos?
```java
List<Integer> numeros = Arrays.asList(
    5,
    8,
    12,
    20
);
```

---

## Nível 3 - Trabalhando com Objetos

Crie a seguinte classe base:

```java
public class Produto {

    private String nome;
    private double preco;
    private String categoria;

    // Construtor, Getters e Setters
}
```

Considere a lista de produtos:
```java
List<Produto> produtos = Arrays.asList(
    new Produto("Notebook", 4500, "Eletrônico"),
    new Produto("Mouse", 120, "Eletrônico"),
    new Produto("Mesa", 900, "Móveis"),
    new Produto("Cadeira", 700, "Móveis"),
    new Produto("Teclado", 250, "Eletrônico"),
    new Produto("Geladeira", 3800, "Eletrodoméstico")
);
```

---

### Exercício 16
Liste apenas os produtos da categoria `Eletrônico`.

### Exercício 17
Retorne somente os nomes dos produtos.

### Exercício 18
Retorne apenas os produtos com preço acima de R$ 1000.

### Exercício 19
Calcule o valor total de todos os produtos.

### Exercício 20
Encontre o produto mais caro.

### Exercício 21
Encontre o produto mais barato.

### Exercício 22
Ordene os produtos pelo preço.

### Exercício 23
Ordene os produtos pelo nome.

### Exercício 24
Conte quantos produtos existem em cada categoria.  
*Dica:* utilize `Collectors.groupingBy()` junto com `Collectors.counting()`.

### Exercício 25
Agrupe todos os produtos pela categoria.

**Resultado esperado (conceitualmente):**
```text
Eletrônico
    Notebook
    Mouse
    Teclado

Móveis
    Mesa
    Cadeira

Eletrodoméstico
    Geladeira
```

---

## Nível 4 - Desafios

### Exercício 26
Encontre os três produtos mais caros.

### Exercício 27
Calcule a média de preço por categoria.

### Exercício 28
Retorne uma lista contendo apenas os nomes dos produtos em ordem alfabética.

### Exercício 29
Verifique se existe algum produto com preço maior que R$ 5000.

### Exercício 30
Separe os produtos em dois grupos:
1. Preço maior ou igual a R$ 1000
2. Preço menor que R$ 1000

*Dica:* utilize `Collectors.partitioningBy()`.

---

## Exercício Final (Desafio Completo)

Crie uma classe `Funcionario`:

```java
public class Funcionario {

    private String nome;
    private String departamento;
    private double salario;
    private int idade;

    // Construtor, Getters e Setters
}
```

Monte uma lista com pelo menos 10 funcionários e responda aos itens abaixo utilizando **apenas Stream API**:

1. Liste os funcionários com salário acima de R$ 5000.
2. Liste os nomes em ordem alfabética.
3. Calcule a média salarial.
4. Descubra o maior salário.
5. Descubra o menor salário.
6. Agrupe os funcionários por departamento.
7. Conte quantos funcionários há em cada departamento.
8. Calcule a média salarial por departamento.
9. Encontre o funcionário mais velho.
10. Encontre o funcionário mais novo.
11. Liste apenas os nomes dos funcionários do departamento "TI".
12. Verifique se todos recebem mais de um salário mínimo.
13. Verifique se existe algum funcionário com mais de 60 anos.
14. Encontre os cinco maiores salários.
15. Crie um `Map<String, Double>` em que a chave é o nome do funcionário e o valor é o salário.

---

> **Resumo dos Métodos Praticados:**  
> Esses exercícios cobrem os principais métodos da Stream API utilizados no desenvolvimento backend e em entrevistas técnicas: `filter`, `map`, `sorted`, `distinct`, `limit`, `skip`, `count`, `reduce`, `max`, `min`, `anyMatch`, `allMatch`, `collect`, `groupingBy`, `partitioningBy`, `mapping`, `counting`, `averagingDouble` e `toMap`.