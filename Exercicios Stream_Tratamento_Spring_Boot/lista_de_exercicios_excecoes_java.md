# Lista de Exercícios: Tratamento de Exceções em Java

---

## Nível 1 – Identificando Exceções

### Exercício 1
Observe o código:

```java
public class Ex1 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        System.out.println(numeros[5]);
    }
}
```

**Perguntas:**
1. O código compila?
2. Qual exceção ocorre?
3. Em qual linha ela acontece?
4. Como evitar essa exceção?

---

### Exercício 2
Observe o código:

```java
public class Ex2 {
    public static void main(String[] args) {

        String texto = null;

        System.out.println(texto.length());
    }
}
```

**Responda:**
1. Qual exceção será lançada?
2. Por que ela acontece?
3. Como corrigir?

---

### Exercício 3
Observe o código:

```java
public class Ex3 {

    public static void main(String[] args) {

        String numero = "ABC";

        int n = Integer.parseInt(numero);

        System.out.println(n);
    }
}
```

**Responda:**
1. O programa compila?
2. Qual exceção acontece?
3. Em que momento ela ocorre?

---

## Nível 2 – Utilizando `try-catch`

### Exercício 4
Escreva um programa que:
* Peça um número ao usuário;
* Divida `100` pelo número informado;
* Trate a exceção caso o usuário digite zero.

---

### Exercício 5
Faça um programa que:
* Leia um número inteiro;
* Trate o caso em que o usuário digite letras.

> **Dica:** utilize a classe `Scanner`.

---

### Exercício 6
Modifique o código abaixo para que o programa não seja encerrado caso ocorra erro:

```java
String nome = null;

System.out.println(nome.toUpperCase());
```

---

## Nível 3 – Múltiplos `catch`

### Exercício 7
Faça um programa que:
* Leia dois números;
* Realize uma divisão;
* Trate:
  * Divisão por zero;
  * Entrada inválida.
* Utilize dois blocos `catch`.

---

### Exercício 8
Observe o código abaixo:

```java
String[] nomes = {"Ana", "Carlos"};

Scanner sc = new Scanner(System.in);

int indice = sc.nextInt();

System.out.println(nomes[indice]);
```

Trate:
* Índice inexistente;
* Valor digitado que não seja inteiro.

---

## Nível 4 – `finally`

### Exercício 9
Faça um programa que:
* Abra um `Scanner`;
* Leia um número;
* Utilize `finally` para fechar o `Scanner`, independentemente de ocorrer erro.

---

### Exercício 10
Explique com suas palavras:
1. Quando o bloco `finally` é executado?
2. Em quais situações ele pode não ser executado?

---

## Nível 5 – `throws`

### Exercício 11
Considere o código:

```java
public static void abrirArquivo() {
    FileReader arquivo = new FileReader("dados.txt");
}
```

**Responda:**
1. O código compila?
2. O compilador reclama de quê?
3. Como resolver usando `throws`?

---

### Exercício 12
Altere o exercício anterior utilizando `try-catch` em vez de `throws`.

---

### Exercício 13
1. Crie um método:
   ```java
   public static void lerArquivo() throws IOException
   ```
   que apenas tente abrir um arquivo.
2. Depois, no `main`, trate a exceção utilizando `try-catch`.

---

## Nível 6 – Criando Exceções e Lançando Exceções

### Exercício 14
Crie um método:

```java
public static void verificarIdade(int idade)
```

* Se a idade for menor que 18:
  * Lance uma exceção usando `throw`.
* Caso contrário:
  * Exiba `"Acesso permitido."`.

---

### Exercício 15
1. Crie uma exceção personalizada chamada:
   ```java
   SaldoInsuficienteException
   ```
2. Depois faça um método:
   ```java
   sacar(double valor)
   ```
   que lança a exceção caso o saldo seja insuficiente.

---

## Nível 7 – Decidindo entre `try-catch` e `throws`

Para cada situação abaixo, diga se você usaria `try-catch` ou `throws`:

* **Exercício 16:** Um método da camada de serviço chama outro método responsável por ler um arquivo.
* **Exercício 17:** O método `main` tenta abrir um arquivo e deseja informar uma mensagem amigável ao usuário.
* **Exercício 18:** Um método utilitário apenas converte um arquivo em PDF e quem o chama decide o que fazer em caso de erro.
* **Exercício 19:** Você está desenvolvendo uma biblioteca Java utilizada por outros projetos. Como prefere tratar as exceções?

---

## Nível 8 – Complete o Código

### Exercício 20
Complete:

```java
try {

    int x = 10 / 0;

} catch (____________ e) {

    System.out.println("Erro!");

}
```

---

### Exercício 21
Complete:

```java
public static void lerArquivo() __________ IOException {

}
```

---

### Exercício 22
Complete:

```java
throw new ______________________("Idade inválida");
```

---

### Exercício 23
Complete:

```java
try {

}
catch(ArithmeticException e){

}
____________{

    System.out.println("Fim.");

}
```

---

## Nível 9 – Análise de Código

### Exercício 24
Explique o que acontecerá:

```java
try {

    System.out.println("A");

    int x = 5 / 0;

    System.out.println("B");

}
catch (ArithmeticException e){

    System.out.println("C");

}
finally{

    System.out.println("D");

}

System.out.println("E");
```

**Pergunta:** Qual será a saída?

---

### Exercício 25
Analise:

```java
try {

    String s = null;

    System.out.println(s.length());

}
catch(Exception e){

    System.out.println("Erro.");

}
```

**Pergunta:** Por que o `catch` funciona mesmo sem usar `NullPointerException`?

---

## Desafio Final

Crie um sistema simples de conta bancária com um menu:
1. Depositar
2. Sacar
3. Consultar saldo
4. Sair

**Requisitos:**
* Tratar entradas inválidas (`InputMismatchException`).
* Não permitir saque maior que o saldo (utilizando uma exceção personalizada).
* Fechar o `Scanner` no `finally` ou utilizando *try-with-resources*.
* Organizar o código em métodos.
* Utilizar `throws` onde fizer sentido para propagar exceções e `try-catch` na camada responsável por interagir com o usuário.

---

## Objetivo de Aprendizagem

Ao concluir essa lista, você deverá ser capaz de:
* Identificar as principais exceções da biblioteca padrão do Java.
* Diferenciar exceções verificadas (*checked*) e não verificadas (*unchecked*).
* Decidir quando usar `try-catch` e quando propagar exceções com `throws`.
* Utilizar corretamente `throw`, `throws`, `finally` e exceções personalizadas.
* Aplicar tratamento de exceções em programas Java organizados por camadas, uma prática comum em aplicações com Spring Boot e desenvolvimento backend.