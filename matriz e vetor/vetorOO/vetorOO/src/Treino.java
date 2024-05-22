import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número de posições do vetor:");
        int numeros = scanner.nextInt();

        int [] vetorDeNumeros = new int[numeros];
        System.out.println("Insira um número inteiro:");
        for (int i = 0; i < vetorDeNumeros.length; i++) {
            vetorDeNumeros[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(vetorDeNumeros));

        System.out.println("Números negativos: ");
        for (int i = 0; i < vetorDeNumeros.length; i++){
            if (vetorDeNumeros[i] < 0 ) {
                System.out.println(vetorDeNumeros[i]);
            }
        }


    }
}
