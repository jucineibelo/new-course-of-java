import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int linhas, colunas;
        double somalinha;

        System.out.print("Qual a quantidade de linhas da matriz? ");
        linhas = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        colunas = sc.nextInt();

        double[][] matriz = new double[linhas][colunas];
        double[] vetor = new double[linhas];

        for (int i = 0; i < linhas; i++) {
            System.out.printf("Digite os elementos da %d a. linha\n", i + 1);

            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < linhas; i++) {
            somalinha = 0;

            for (int j = 0; j < colunas; j++) {
                somalinha = somalinha + matriz[i][j];
            }
            vetor[i] = somalinha;
        }

        System.out.println("VETOR GERADO:");

        for (int i = 0; i < linhas; i++) {
            System.out.printf("%.1f\n", vetor[i]);
        }

        sc.close();
    }
}