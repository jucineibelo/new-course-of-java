import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a ordem da matriz:");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento [" + i + "," + j + "]");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("QUANTIDADE DE NEGATIVOS= ");
        int count = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.print(count);

        scanner.close();
    }

}
