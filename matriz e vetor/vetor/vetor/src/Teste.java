import java.util.Arrays;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero de posições do vetor:");
        int numeroPosicoes = sc.nextInt();

        int [] vetorBosta = new int [numeroPosicoes];

        for (int i = 0; i < numeroPosicoes; i++){
            System.out.println("Insira um inteiro:");
            vetorBosta[i] = sc.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < numeroPosicoes; i++){
            soma = soma + vetorBosta[i];
        }
        double media = soma / numeroPosicoes;
        System.out.println(soma);
        System.out.println(media);
        System.out.println(Arrays.toString(vetorBosta));




    }
}
