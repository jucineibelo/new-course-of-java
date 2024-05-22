import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o numero de posições que você deseja para o vetor:");
        int numeroPosicoes = scanner.nextInt();

        double [] myVetor = new double[numeroPosicoes];
        double soma = 0;
        for (int i = 0; i < numeroPosicoes; i++) {
            myVetor[i] = scanner.nextDouble();
            soma = soma + myVetor[i];
        }

        System.out.println(Arrays.toString(myVetor));
        System.out.println(soma);



    }
}