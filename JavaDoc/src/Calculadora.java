import java.util.Scanner;

/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos pelo autor.
 *
 * @author Breno Figueira
 * @version 1.0
 * @since 02/11/2024
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros.
     * @param numeroUm este é o primeiro parâmetro do método.
     * @param numeroDois este é o segundo parâmetro do método.
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numeroDois = scanner.nextInt();

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(numeroUm, numeroDois);

        System.out.println("A soma dos números é: " + resultado);
        
        // Fechando o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
