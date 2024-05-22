import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String dia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número de 1 a 7:");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1: {
                dia = "Domingo";
                break;
            }
            case 2: {
                dia = "Segunda-feira";
                break;
            }
            case 3: {
                dia = "Terça-feira";
                break;
            }
            case 4: {
                dia = "Quarta-feira";
                break;
            }
            case 5: {
                dia = "Quinta-feira";
                break;
            }
            case 6: {
                dia = "Sexta-feira";
                break;
            }
            case 7: {
                dia = "Sabado";
                break;
            }
            default: {
                dia = "Dia invalido!";
                break;
            }
        }
        System.out.println("O dia da semana inserido é: " + dia);

    }
}
