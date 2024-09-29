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
- **Decremento (–)**: Diminui o valor do operando em 1.
- **Unário positivo (+)**: Indica um valor positivo (geralmente implícito).
- **Unário negativo (-)**: Inverte o sinal do valor.

Exemplo:
```java
int x = 10;
x++; // 11
x--; // 10
int y = -x; // -10
```