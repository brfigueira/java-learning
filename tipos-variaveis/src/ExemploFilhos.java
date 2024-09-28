// Definição da classe Filho
class Filho {
    // Atributos da classe Filho
    String nome;
    int idade;

    // Construtor da classe Filho
    public Filho(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir informações do filho
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

// Classe principal para testar variáveis de objeto
public class ExemploFilhos {
    public static void main(String[] args) {
        // Criando e inicializando variáveis de objeto
        Filho filho1 = new Filho("Maria", 12);
        Filho filho2 = new Filho("José", 3);
        Filho filho3 = new Filho("Joana", 3);

        // Exibindo informações dos objetos Filho
        filho1.exibirInformacoes();
        filho2.exibirInformacoes();
        filho3.exibirInformacoes();
    }
}