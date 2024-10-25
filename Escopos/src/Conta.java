public class Conta {
    // Variável da classe Conta
    double saldo = 1000.0; // Alterado para 1000

    public void sacar(Double valor) {
        // Variável local de método
        double novoSaldo = saldo - valor;
        saldo = novoSaldo; // Atualizando o saldo após saque
    }

    public void imprimirSaldo() {
        // Disponível em toda a classe
        System.out.println("Saldo atual: " + saldo);
        // System.out.println(novoSaldo); // Comentado pois 'novoSaldo' não está no escopo deste método
    }

    public double calcularDividaExponencial() {
        // Variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; // Iniciando a variável com valor zero

        for (int x = 1; x <= 5; x++) { // 'x' variável de escopo de fluxo
            // Esta variável será reiniciada a cada execução do for
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        // Escopo de fluxo: 'x' e 'valorCalculado' não estarão disponíveis fora do for
        return valorMontante;
    }

    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        // Imprimir saldo inicial
        minhaConta.imprimirSaldo();

        // Sacar um valor
        minhaConta.sacar(200.0); // Alterado para 200
        
        // Imprimir saldo após saque
        minhaConta.imprimirSaldo();

        // Calcular e imprimir dívida exponencial
        double divida = minhaConta.calcularDividaExponencial();
        System.out.println("Dívida exponencial: " + divida);
    }
}