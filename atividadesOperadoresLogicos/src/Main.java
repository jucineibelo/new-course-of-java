import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Integer> idades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 11; i++) {
            System.out.println("Informe " + i + " idades de pessoas:");
            int idade = scanner.nextInt();
            idades.add(idade);
        }

        for (Integer teste : idades) {
            System.out.println(teste >= 18 ? "maior de idade: " + teste : "menor de idade: " + teste);
        }
    }
}

//Exercicio 4