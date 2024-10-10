# Métodos em Java

Este repositório contém exemplos e explicações sobre métodos na linguagem de programação Java.

## O que são Métodos?

Em Java, um método é um bloco de código que executa uma tarefa específica. Métodos são usados para organizar e reutilizar código, tornando os programas mais fáceis de entender e manter.

## Tipos de Métodos

### Métodos de Instância

Métodos de instância operam sobre instâncias da classe. Eles podem acessar atributos e outros métodos da classe.

Exemplo de Método de Instância:
```java
public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
```

### Métodos Estáticos

Métodos estáticos pertencem à classe e não a instâncias específicas. Eles não podem acessar atributos de instância diretamente.

Exemplo de Métodos Estáticos:
```java
public class Calculadora {
    public static int somar(int a, int b) {
        return a + b;
    }
}
```
## Parâmetros e Retorno de Métodos

### Parâmetros

Métodos podem receber parâmetros, que são valores passados para o método quando ele é chamado.

Exemplo com Parâmetros:
```java
public class Saudacao {
    public void dizerOla(String nome) {
        System.out.println("Olá, " + nome);
    }
}
```

### Retorno

Métodos podem retornar valores. O tipo de retorno é especificado na declaração do método.

Exemplo com Retorno:
```java
public class Calculadora {
    public int multiplicar(int a, int b) {
        return a * b;
    }
}
```

## Sobrecarga de Métodos
Sobrecarga permite definir múltiplos métodos com o mesmo nome, mas com diferentes parâmetros.

Exemplo de Sobrecarga:
```java
public class Calculador{
    public void calcularImprimir(int a, int b) {
        int resultado = a + b;
        System.out.println("A soma de " + a + " e " + b + " é: " + resultado);
    }
} 
```