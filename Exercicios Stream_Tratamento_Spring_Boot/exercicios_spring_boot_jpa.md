# Exercícios Práticos — Spring Boot & Spring Data JPA

Este guia contém uma trilha estruturada de exercícios para aprendizado e consolidação de conhecimentos em **Spring Boot**, **Spring Data JPA**, **Bean Validation**, **Tratamento de Exceções** e **Modelagem de Dados (Relacionamentos e Herança)**.

---

## 🟢 Nível 1 — Spring Boot e Annotations Básicas

### Exercício 1 — Criando o projeto
Crie uma aplicação Spring Boot chamada `ProductApi`.

**Dependências necessárias:**
- Spring Web
- Spring Data JPA
- Validation
- MySQL Driver

**Tarefas:**
1. Crie a classe principal anotada com `@SpringBootApplication`.
2. Crie um endpoint `GET /hello`.
3. Retorne a string `"API funcionando!"`.

**Annotations utilizadas:**
`@SpringBootApplication`, `@RestController`, `@GetMapping`

---

### Exercício 2 — Controller
Crie a classe `ProductController` e implemente as seguintes rotas:

- `GET /products`
- `GET /products/{id}`
- `POST /products`
- `PUT /products/{id}`
- `DELETE /products/{id}`

Utilize as annotations apropriadas para cada verbo HTTP e parâmetro.

**Objetivo:** Saber diferenciar e aplicar corretamente:
- `@GetMapping`
- `@PostMapping`
- `@PutMapping`
- `@DeleteMapping`
- `@PathVariable`
- `@RequestBody`
- `@RequestParam`

---

### Exercício 3 — Injeção de Dependência
Monte a arquitetura em camadas para o recurso de produtos:

$$	ext{ProductController} \longrightarrow 	ext{ProductService} \longrightarrow 	ext{ProductRepository}$$

- Realize a injeção de dependências utilizando **construtores**.

**Pergunta de fixação:**
- Qual é a função exata das anotações `@Service` e `@Repository` no ecossistema Spring?

---

## 🟡 Nível 2 — Entidades e JPA

### Exercício 4 — Primeira Entity
Crie a entidade `Product` com a seguinte estrutura de atributos:

| Atributo | Tipo |
| :--- | :--- |
| `id` | Long |
| `name` | String |
| `description` | String |
| `price` | BigDecimal / Double |
| `stock` | Integer |

**Annotations a utilizar:**
- `@Entity`
- `@Table`
- `@Id`
- `@GeneratedValue`
- `@Column`

Configurar a geração automática da chave primária (`id`).

---

### Exercício 5 — Repository
Crie a interface do repositório:

```java
public interface ProductRepository extends JpaRepository<Product, Long> {
}
```

Implemente/utilize as operações para:
- Cadastrar produto
- Buscar todos os produtos
- Buscar produto por ID
- Atualizar produto
- Excluir produto

**Objetivo:** Entender o papel do `JpaRepository` e os métodos herdados.

---

### Exercício 6 — DTO (Data Transfer Object)
Crie as classes de DTO:

1. **`ProductRequest`** (dados recebidos na requisição):
   - `name`
   - `description`
   - `price`
   - `stock`

2. **`ProductResponse`** (dados devolvidos na resposta):
   - `id`
   - `name`
   - `price`
   - `stock`

**Objetivo:** Evitar receber ou expor diretamente a entidade (`Entity`) na camada de Controller.

---

## 🟠 Nível 3 — Validation & Exception Handling

### Exercício 7 — Validação de Produto
Adicione validações no DTO `ProductRequest`:

- `name` → Obrigatório (`@NotBlank`)
- `description` → Obrigatório (`@NotBlank`)
- `price` → Deve ser maior que 0 (`@Positive`)
- `stock` → Deve ser maior ou igual a 0 (`@PositiveOrZero`)
- No Controller, utilize `@Valid` nas requisições.

Em seguida, crie um tratamento global para captura de erros de validação utilizando:
- `@RestControllerAdvice`
- `@ExceptionHandler`

---

### Exercício 8 — Exception Personalizada
1. Crie a exceção customizada `ProductNotFoundException`.
2. Quando o usuário buscar um produto inexistente (ex: `GET /products/999`), lance a exceção e retorne HTTP status **404 NOT FOUND**.
3. Crie uma estrutura de resposta padronizada para erros:

```json
{
    "status": 404,
    "message": "Produto não encontrado"
}
```

---

## 🔵 Nível 4 — Relacionamentos JPA

*Esta seção é fundamental para o estudo de modelagem relacional de dados com ORM.*

### Exercício 9 — Produto e Categoria (Muitos para Um)
Modele a relação onde um produto pertence a uma categoria ($N ightarrow 1$):

```
Category (1) <------- (N) Product
```

**Estruturas:**
- `Category`: `id`, `name`
- `Product`: `id`, `name`, `price`, `category`

**Annotations:**
- `@ManyToOne`
- `@JoinColumn`

**Tarefas:**
- Implemente `POST /categories` e `POST /products`.
- No payload do produto, receba o ID da categoria associada.

---

### Exercício 10 — Categoria $ightarrow$ Produtos (Bidirecional)
Torne o relacionamento entre `Category` e `Product` bidirecional:

- Na classe `Category`: `@OneToMany`
- Na classe `Product`: `@ManyToOne`

Estude e compreenda a diferença entre:
- `mappedBy`
- `@JoinColumn`

> **🧠 Desafio:** Descubra por que você **não** deve colocar `@JoinColumn` nos dois lados de um relacionamento bidirecional.

---

## 🟣 Nível 5 — Relacionamento OneToOne

### Exercício 11 — Produto e Detalhes
Modele uma relação um para um ($1 ightarrow 1$):

```
Product (1) <-------> (1) ProductDetails
```

**Atributos de `ProductDetails`:**
- `id`
- `weight`
- `height`
- `width`
- `manufacturerCode`

**Annotations:**
- `@OneToOne`
- `@JoinColumn`

**Endpoints:**
- `POST /products`
- `POST /products/{id}/details`

---

## 🔴 Nível 6 — Relacionamento ManyToMany

### Exercício 12 — Produto e Marca
Modele a relação $N ightarrow N$ entre produtos e marcas:

```
Product (N) <-------> (N) Brand
```

- Um produto pode possuir várias marcas associadas e uma marca pode estar associada a vários produtos.

**Annotations:**
- `@ManyToMany`
- `@JoinTable`
- `@JoinColumn`

Observe como o Hibernate gera a tabela intermediária no banco de dados (`product_brand`):

| Tabela: `product_brand` |
| :--- |
| `product_id` (FK) |
| `brand_id` (FK) |

> **🧠 Desafio:** Explique a diferença teórica e prática entre `@JoinColumn` e `@JoinTable`.

---

## 🟤 Nível 7 — Agregação

### Exercício 13 — Loja e Produtos
Modele a relação entre `Store` e `Product`:

```
Store ──(possui)──> Product 1
                  ├── Product 2
                  └── Product 3
```

- Uma loja (`Store`) possui produtos, mas o produto pode continuar existindo independentemente da loja. Modele esse cenário como uma **agregação**.

**Perguntas de reflexão:**
1. Qual é a diferença conceitual entre **agregação** e **composição**?
2. Analisando `Store` e `Product`, qual tipo de relacionamento e cascading JPA é o mais adequado?

---

## ⚫ Nível 8 — Composição

### Exercício 14 — Pedido e Itens
Modele o relacionamento entre Pedido (`Order`) e Itens do Pedido (`OrderItem`):

```
Order ──(composto por)──> OrderItem 1
                       ├── OrderItem 2
                       └── OrderItem 3
```

- Um `OrderItem` **não deve existir** sem o seu `Order` correspondente.

**Annotations e Configurações:**
- `@OneToMany` em `Order`
- `@ManyToOne` em `OrderItem`
- `cascade = CascadeType.ALL`
- `orphanRemoval = true`

> **🧠 Desafio:** Descubra exatamente o que acontece ao executar `orderRepository.delete(order)` usando `cascade = CascadeType.ALL` e compare com o comportamento do `orphanRemoval = true` ao remover um item da lista do pedido.

---

## 🟧 Nível 9 — Herança

### Exercício 15 — Hierarquia de Usuários
Modele a seguinte hierarquia de classes:

```
          ┌──────────┐
          │   User   │
          └────┬─────┘
               │
     ┌─────────┴─────────┐
     ▼                   ▼
┌──────────┐       ┌──────────┐
│ Customer │       │ Employee │
└──────────┘       └──────────┘
```

**Atributos:**
- `User`: `id`, `name`, `email`
- `Customer`: `customerCode`
- `Employee`: `employeeCode`, `salary`

Anote a classe base com `@Inheritance` e estude as três estratégias disponíveis:
1. `InheritanceType.SINGLE_TABLE`
2. `InheritanceType.JOINED`
3. `InheritanceType.TABLE_PER_CLASS`

---

### Exercício 16 — Herança com Estratégia JOINED
Aplique a anotação:

```java
@Inheritance(strategy = InheritanceType.JOINED)
```

Observe a estrutura de tabelas criada no banco de dados relacional:

- **`user`**: `id`, `name`, `email`
- **`customer`**: `id`, `customer_code` (onde `customer.id` referencia `user.id`)
- **`employee`**: `id`, `employee_code`, `salary` (onde `employee.id` referencia `user.id`)

---

## 🟥 Nível 10 — Herança + Relacionamentos

### Exercício 17 — Sistema de E-commerce (Polimorfismo)
Integre herança e domínio de catálogo:

```
                  ┌─────────┐
                  │ Product │
                  └────┬────┘
                       │
             ┌─────────┴─────────┐
             ▼                   ▼
       ┌──────────┐        ┌──────────┐
       │ Sneaker  │        │ Clothing │
       └──────────┘        └──────────┘
```

**Atributos:**
- `Product`: `id`, `name`, `price`, `description`
- `Sneaker`: `brand`, `model`, `gender`
- `Clothing`: `size`, `material`

Use `@Inheritance` e `@Entity` para estruturar esse modelo.

---

### Exercício 18 — Sneaker e Variações
Modelo focado no domínio de calçados/vestuário:

```
Sneaker (1) <─────── (N) SneakerVariation
```

**Atributos:**
- `Sneaker`: `id`, `name`, `price`, `brand`
- `SneakerVariation`: `id`, `color`, `size`, `quantityInStock`

**Annotations:**
- `@OneToMany`
- `@ManyToOne`
- `@JoinColumn`

---

## 🔥 Nível 11 — Projeto Completo

### Exercício 19 — API de E-commerce Integrada
Crie uma API completa combinando todos os conceitos praticados:

```
User (Base)
 ├── Customer
 └── Employee

Category
 └── Product (Base)
       ├── Sneaker
       └── Clothing
             └── Variation

Order
 └── OrderItem
       └── Product
```

#### Checklist de Annotations Obrigatórias:

* **Spring:** `@SpringBootApplication`, `@RestController`, `@Service`, `@Repository`, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`, `@PathVariable`, `@RequestBody`, `@RequestParam`
* **JPA:** `@Entity`, `@Table`, `@Id`, `@GeneratedValue`, `@Column`, `@Enumerated`, `@ManyToOne`, `@OneToMany`, `@OneToOne`, `@ManyToMany`, `@JoinColumn`, `@JoinTable`, `@Inheritance`, `@MappedSuperclass`
* **Validation:** `@Valid`, `@NotNull`, `@NotBlank`, `@Size`, `@Positive`, `@PositiveOrZero`, `@Email`
* **Tratamento de Exceções:** `@RestControllerAdvice`, `@ExceptionHandler`

---

## 🧠 Desafio Final — Autoavaliação

*Após concluir os exercícios, responda às seguintes perguntas para testar seu domínio dos conceitos sem consultar material de apoio:*

1. **Entity vs Table:** Qual a diferença prática entre `@Entity` e `@Table`?
2. **Identificadores:** Qual a função de `@Id` e `@GeneratedValue`?
3. **Relacionamentos:** Explique a diferença entre `@OneToOne`, `@OneToMany`, `@ManyToOne` e `@ManyToMany`.
4. **Mapeamento:** Para que serve o argumento `mappedBy = "category"`?
5. **JoinColumn:** Em quais cenários devemos utilizar `@JoinColumn`?
6. **JoinTable:** Em quais cenários devemos utilizar `@JoinTable`?
7. **Cascading:** Qual a diferença entre `CascadeType.PERSIST`, `MERGE`, `REMOVE` e `ALL`?
8. **Composição:** Por que a relação `Order → OrderItem` representa uma **composição**?
9. **Agregação:** Por que a relação `Store → Product` representa uma **agregação**?
10. **Estratégias de Herança:** Qual a diferença entre `@Inheritance(strategy = SINGLE_TABLE)` e `@Inheritance(strategy = JOINED)`?
11. **Herança de Atributos:** Para que serve `@MappedSuperclass` e como ela difere de `@Inheritance`?
12. **Orphan Removal:** O que acontece na prática quando `orphanRemoval = true` está ativado e um objeto é removido da coleção?

---

## 📈 Roteiro Recomendado de Estudo

Para garantir uma aprendizagem sólida, siga os exercícios na ordem abaixo:

1. Spring Boot básico *(Ex. 1)*
2. Controller *(Ex. 2)*
3. Service *(Ex. 3)*
4. Repository *(Ex. 3, 5)*
5. Entity *(Ex. 4)*
6. DTO *(Ex. 6)*
7. Validation *(Ex. 7)*
8. Exceptions *(Ex. 8)*
9. ManyToOne *(Ex. 9)*
10. OneToMany *(Ex. 10)*
11. OneToOne *(Ex. 11)*
12. ManyToMany *(Ex. 12)*
13. Agregação *(Ex. 13)*
14. Composição *(Ex. 14)*
15. Herança *(Ex. 15)*
16. JOINED *(Ex. 16)*
17. Herança + Relacionamentos *(Ex. 17)*
18. Sneaker + Variation *(Ex. 18)*
19. Projeto Completo *(Ex. 19)*

> 💡 **Nota:** Dê atenção especial aos exercícios **13 a 18**, pois eles conectam a modelagem orientada a objetos (produtos, tênis e variações) à forma como o JPA traduz esses conceitos para relacionamentos relacionais no banco de dados.
