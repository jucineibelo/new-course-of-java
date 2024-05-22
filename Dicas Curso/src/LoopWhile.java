import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        int acumulador = 0;
        int numero = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número:");
        numero = scan.nextInt();

        while (numero != 0) {
            acumulador = acumulador + numero;
            System.out.println("Insira um número:");
            numero = scan.nextInt();
        }
        System.out.println("Você saiu do laço a soma dos números é: " + acumulador);
        scan.close();
    }
}
