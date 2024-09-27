public class ExemploVariaveis {
    // Variável de classe
    static int contador = 0;

    // Variáveis de instância
    String nome;
    int idade;
    boolean ativo;
    char inicial;
    byte nivel;
    short ano;
    long populacao;
    float altura;
    double peso;

    public void exemploMetodo() {
        // Variáveis locais
        boolean isEstudante = true;
        char genero = 'M';
        byte idadeByte = 25;
        short anoNascimento = 1995;
        int salario = 50000;
        long distancia = 123456789L;
        float temperatura = 36.6f;
        double pi = 3.14159;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ativo: " + ativo);
        System.out.println("Inicial: " + inicial);
        System.out.println("Nível: " + nivel);
        System.out.println("Ano: " + ano);
        System.out.println("População: " + populacao);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Estudante: " + isEstudante);
        System.out.println("Gênero: " + genero);
        System.out.println("Idade (byte): " + idadeByte);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Salário: " + salario);
        System.out.println("Distância: " + distancia);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Pi: " + pi);
    }
}
