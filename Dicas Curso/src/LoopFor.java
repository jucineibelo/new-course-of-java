import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas vezes deseja repetir: ");
        int numeroVezes = scanner.nextInt();

        int acumulador = 0;
        for (int i = 0; i < numeroVezes; i++) {
            acumulador = acumulador + numeroVezes;

        }
        System.out.println(acumulador);
    }
}
