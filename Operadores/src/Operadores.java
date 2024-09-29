public class Operadores {
    // Os operadores aritméticos são: adição(+), subtração(-), multiplicação(*), divisão(/).
    public static void main(String[] args) {
        // O operador aritmético de adição quando usado em strings cria a concatenação dessas duas palavras.
        String primeiroNome = "Breno";
        String ultimoNome  = "Figueira";
        System.out.println(primeiroNome + " " + ultimoNome);

        //String concatenacao = "?";

        //concatenacao = 1+1+1+"1";

        //System.out.println(concatenacao);

        //concatenacao = 1+"1"+1+1;

        //System.out.println(concatenacao);

        //concatenacao = 1+"1"+1+"1";

        //System.out.println(concatenacao);

        //concatenacao = "1"+1+1+1;

        //System.out.println(concatenacao);

        //concatenacao = "1"+(1+1+1);

        //System.out.println(concatenacao);

        // Operadores unários

        int numero = 5;

        System.out.println( - numero);

        System.out.println(numero);

        System.out.println(++ numero);

        System.out.println(-- numero);

        numero = - numero;

        System.out.println(numero);

        System.out.println(+ numero);

        System.out.println(- numero);

        numero = + numero;
        
        System.out.println(numero);

        System.out.println( - numero);

        numero = numero * -1;

        System.out.println(numero);

        
    }
}
