public class ExemploVariaveis {
    public static void main(String[] args) throws Exception{
         
        // Variáveis Primitivas

         boolean estudante = false;
         System.out.println("O usuário é um estudante? " + estudante);

         char genero = 'M';
         System.out.println("O genero biológico do usuário é  " + genero);

         byte idade = 39;
         System.out.println("O usuário tem " + idade + " anos de idade");

         short anoNascimento = 1985;
         System.out.println("O usuário nasceu em " + anoNascimento);

         int playlist = 54563;
         System.out.println("O usuário tem uma playlist com mais de " + playlist + " musicas");
         
         long distanciaLua = 384400000L;
         System.out.println("A distancia em metros da terra para a lua é de " + distanciaLua + " metros");
         
         float temperaturaCorporal = 36.6f;
         System.out.println("A temperatura corporal do corpo do usuário é de " + temperaturaCorporal + "Celsius");

         double pi = 3.14159;
         System.out.println("O valor de pi é" + pi);

         //Variáveis de referência

         String nome = "Breno";
         System.out.println("O nome do usuário é " + nome);

         int[] contagem = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

         // Imprimindo os valores do array individualmente
         System.out.println(contagem[0]); // Imprime o primeiro elemento do array (1)
         System.out.println(contagem[1]); // Imprime o segundo elemento do array (2)
         System.out.println(contagem[2]); // Imprime o terceiro elemento do array (3)
         System.out.println(contagem[3]); // Imprime o quarto elemento do array (4)
         System.out.println(contagem[4]); // Imprime o quinto elemento do array (5)
         System.out.println(contagem[5]); // Imprime o sexto elemento do array (6)
         System.out.println(contagem[6]); // Imprime o sétimo elemento do array (7)
         System.out.println(contagem[7]); // Imprime o oitavo elemento do array (8)
         System.out.println(contagem[8]); // Imprime o nono elemento do array (9)
         System.out.println(contagem[9]); // Imprime o décimo elemento do array (10)

         //Variáveis objetos, sera feito um exemplo separadamente
        
    }
}
