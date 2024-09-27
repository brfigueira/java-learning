# Tipos e Variáveis em Java

## Introdução

Em Java, variáveis são usadas para armazenar dados que podem ser manipulados durante a execução de um programa. Cada variável tem um tipo específico que determina o tamanho e o layout da memória da variável, os valores que ela pode armazenar e as operações que podem ser realizadas sobre ela.

## Tipos de Dados

### Tipos Primitivos

Java possui oito tipos de dados primitivos, que são os blocos de construção fundamentais para a manipulação de dados:

1. **boolean**: Representa valores verdadeiros ou falsos.
   - **Tamanho**: 1 bit
   - **Valores possíveis**: `true` ou `false`
   - **Exemplo**: `boolean ativo = true;`

2. **char**: Armazena um único caractere Unicode.
   - **Tamanho**: 16 bits
   - **Valores possíveis**: Qualquer caractere Unicode
   - **Exemplo**: `char inicial = 'A';`

3. **byte**: Armazena inteiros pequenos.
   - **Tamanho**: 8 bits
   - **Valores possíveis**: -128 a 127
   - **Exemplo**: `byte nivel = 10;`

4. **short**: Armazena inteiros de tamanho médio.
   - **Tamanho**: 16 bits
   - **Valores possíveis**: -32.768 a 32.767
   - **Exemplo**: `short ano = 2024;`

5. **int**: Armazena inteiros grandes.
   - **Tamanho**: 32 bits
   - **Valores possíveis**: -2^31 a 2^31-1
   - **Exemplo**: `int idade = 25;`

6. **long**: Armazena inteiros muito grandes.
   - **Tamanho**: 64 bits
   - **Valores possíveis**: -2^63 a 2^63-1
   - **Exemplo**: `long populacao = 7800000000L;`

7. **float**: Armazena números de ponto flutuante de precisão simples.
   - **Tamanho**: 32 bits
   - **Valores possíveis**: Aproximadamente ±3.40282347E+38F (6-7 dígitos decimais significativos)
   - **Exemplo**: `float altura = 1.75f;`

8. **double**: Armazena números de ponto flutuante de precisão dupla.
   - **Tamanho**: 64 bits
   - **Valores possíveis**: Aproximadamente ±1.79769313486231570E+308 (15 dígitos decimais significativos)
   - **Exemplo**: `double peso = 70.5;`

### Tipos de Referência

Além dos tipos primitivos, Java também possui tipos de referência, que são usados para referenciar objetos. Os tipos de referência mais comuns são:

1. **String**: Armazena uma sequência de caracteres.
   - **Exemplo**: `String nome = "João";`

2. **Arrays**: Estruturas que armazenam múltiplos valores do mesmo tipo.
   - **Exemplo**: `int[] numeros = {1, 2, 3, 4, 5};`

3. **Objetos**: Instâncias de classes definidas pelo usuário.
   - **Exemplo**: `Pessoa pessoa = new Pessoa();`

## Declaração de Variáveis

Para declarar uma variável em Java, você deve especificar o tipo da variável seguido pelo nome da variável. A sintaxe básica é:

#### Java

**int idade = 25;** //Variável do tipo int
**String nome = "João";** //Variável do tipo String
**boolean ativo = true;** // Variável do tipo boolean