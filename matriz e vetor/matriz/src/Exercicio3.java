import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a quantidade de linhas da matriz?");
        int linhas = scanner.nextInt();
        System.out.println("Qual a quantidade de colunas da matriz?");
        int colunas = scanner.nextInt();

        double [][] matriz = new double[linhas][colunas];
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++ ){
                System.out.println("Elemento [" + i + "," + j + "]");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVOS:");
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j< colunas; j++){
                if (matriz[i][j] < 0) {
                    System.out.println(matriz[i][j]);
                }
            }
        }




    }
}
