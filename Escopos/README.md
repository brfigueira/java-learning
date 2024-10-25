# Escopos em Java

## Introdução
O escopo de variáveis em Java define a área de código onde as variáveis são acessíveis. Entender os diferentes tipos de escopos é fundamental para evitar conflitos de nomes e garantir o uso correto das variáveis.

## Escopos de Variáveis
1. ***Variáveis Locais***
Variáveis locais são declaradas dentro de um método, construtor ou bloco e são acessíveis apenas dentro desse bloco específico. Elas são criadas quando o bloco de código é executado e destruídas assim que a execução sai do bloco.

```java
public void meuMetodo() {
    int minhaVariavelLocal = 10; // Variável local
    System.out.println(minhaVariavelLocal);
}
```

2. ***Parâmetros de Métodos***
Parâmetros de métodos são variáveis que são passadas para o método. Elas atuam como variáveis locais dentro do método e têm o mesmo escopo.

```java
public void meuMetodo(int parametro) {
    System.out.println(parametro);
}
```

3. ***Variáveis de Instância (Atributos)***
Variáveis de instância são declaradas dentro de uma classe, mas fora de qualquer método. Elas são acessíveis por todos os métodos da classe e são específicas para cada instância da classe.

```java
public class MinhaClasse {
    private int minhaVariavelDeInstancia; // Variável de instância

    public void meuMetodo() {
        minhaVariavelDeInstancia = 10;
        System.out.println(minhaVariavelDeInstancia);
    }
}
```

4. ***Variáveis de Classe (Static)***
Variáveis de classe são declaradas com o modificador static e pertencem à classe em si, não a instâncias individuais. Elas são compartilhadas entre todas as instâncias da classe.

```java
public class MinhaClasse {
    private static int minhaVariavelDeClasse; // Variável de classe

    public void meuMetodo() {
        minhaVariavelDeClasse = 10;
        System.out.println(minhaVariavelDeClasse);
    }
}
```

### Exemplos de Uso

#### Exemplo de Variável Local
```java
public class Exemplo {
    public void metodoExemplo() {
        int x = 5; // Variável local
        if (x == 5) {
            int y = 10; // Variável local dentro do bloco if
            System.out.println(y);
        }
        // System.out.println(y); // Isso causará um erro, pois y não é acessível fora do bloco if
    }
}
``` 

#### Exemplo de Variável de Instância
```java
public class Exemplo {
    private int num; // Variável de instância

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
```

#### Exemplo de Variável de Classe
```java
public class Exemplo {
    private static int contador = 0; // Variável de classe

    public Exemplo() {
        contador++;
    }

    public static int getContador() {
        return contador;
    }
}
```

## Conclusão
Compreender os escopos de variáveis em Java é essencial para escrever código claro e eficiente. Use variáveis locais para dados temporários, variáveis de instância para propriedades de objeto e variáveis de classe para informações compartilhadas entre todas as instâncias.