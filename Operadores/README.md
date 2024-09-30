# Operadores em Java

## Operadores Aritméticos
Os operadores aritméticos são usados para realizar operações matemáticas básicas. Em Java, temos:
- **Adição (+)**: Soma dois valores.
- **Subtração (-)**: Subtrai um valor do outro.
- **Multiplicação (*)**: Multiplica dois valores.
- **Divisão (/)**: Divide um valor pelo outro.
- **Módulo (%)**: Retorna o resto da divisão de dois valores.

Exemplo:
```java
int a = 10;
int b = 5;
int soma = a + b; // 15
int subtracao = a - b; // 5
int multiplicacao = a * b; // 50
int divisao = a / b; // 2
int modulo = a % b; // 0
```
## Concatenação
- A concatenação em Java é usada para unir strings. O operador de concatenação é o + usado em textos (Strings).

Exemplo:
```java
String primeiroNome = "Breno";
String sobrenome = "Figueira";
String nomeCompleto = nome + " " + sobrenome; // "Breno Figueira"
```

## Operadores Unários
Os operadores unários realizam operações em um único operando. Em Java, temos:

- **Incremento (++)**: Aumenta o valor do operando em 1.
- **Decremento (–-)**: Diminui o valor do operando em 1.
- **Unário positivo (+)**: Indica um valor positivo (geralmente implícito).
- **Unário negativo (-)**: Inverte o sinal do valor.
- **Unário de negação(!)**: nefa o valor de uma expressão booleana.

Exemplo:
```java
int x = 10;
x++; // 11
x--; // 10
int y = -x; // -10
boolean variavel = ! false;
```

## Operador Ternário em Java

O operador ternário é uma forma concisa de expressar uma condição que retorna um valor. Ele é uma alternativa ao uso da estrutura `if-else` e pode tornar o código mais legível e compacto.
- **condição**: Uma expressão booleana que é avaliada.
- **valor_se_verdadeiro**: O valor retornado se a condição for verdadeira.
- **valor_se_falso**: O valor retornado se a condição for falsa.

#### Vantagens

1. **Conciso**: Reduz a quantidade de código necessário para expressar uma condição simples.
2. **Legível**: Pode tornar o código mais fácil de ler quando usado corretamente.

#### Desvantagens

1. **Complexidade**: Pode tornar o código mais difícil de entender se usado em condições complexas.
2. **Legibilidade**: Em casos de condições aninhadas, pode prejudicar a legibilidade do código.

#### Quando Usar

O operador ternário é ideal para situações onde você precisa retornar um valor com base em uma condição simples. No entanto, para condições mais complexas, é recomendável usar estruturas if-else tradicionais para manter a clareza do código.

#### Sintaxe

1. A sintaxe do operador ternário é a seguinte:

```java
 condição ? valor_se_verdadeiro : valor_se_falso;
```
