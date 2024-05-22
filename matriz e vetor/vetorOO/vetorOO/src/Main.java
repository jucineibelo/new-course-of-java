import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira quantos produtos deseja criar:");
        try {
            int numeroDeProdutos = scanner.nextInt();

            Product[] vetorProducts = new Product[numeroDeProdutos];

            for (int i = 0; i < vetorProducts.length; i++) {
                System.out.println("Insira o nome do produto:");
                String name = scanner.next();
                System.out.println("Insira o preço do produto:");
                double price = scanner.nextDouble();
                vetorProducts[i] = new Product(name, price);
            }
            double sum = 0;

            for (int i = 0; i < vetorProducts.length; i++) {
                sum = sum + vetorProducts[i].getPrice();
            }
            System.out.printf("A soma de todos os produtos é de: %.2f", sum);
            System.out.println("");
            System.out.println(Arrays.toString(vetorProducts));
        } catch (Exception e) {
            System.out.println("Erro ao inserir produto." + e.getMessage());
        }

        scanner.close();

    }
}