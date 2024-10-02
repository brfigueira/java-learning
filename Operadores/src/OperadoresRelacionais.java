public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nome1 = "Breno";
        String nome2 = new String("Breno");

        System.out.println(nome1 == nome2);

        int valor1 = 1;
        int valor2 = 2;

        if(valor1 < valor2){
            System.out.println("A nossa condição é verdadeira!");
                }

        boolean verdadeiroFalso = valor1 == valor2;

        System.out.println("valorUm é igual a valor dois? " + verdadeiroFalso);

        verdadeiroFalso = valor1 != valor2;

        System.out.println("valor um é diferente a valor dois? " + verdadeiroFalso);

        verdadeiroFalso = valor1 > valor2;

        System.out.println("valor um é maior valor dois? " + verdadeiroFalso);

        }
    
}
