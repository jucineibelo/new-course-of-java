package program;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainComReferenceMethodNonStatic {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos produtos deseja cadastrar:");
        int qtdProdutos = sc.nextInt();

        for (int i = 0; i < qtdProdutos; i++) {
            System.out.println("Informe o nome do produto " + (i + 1) + ":");
            String name = sc.next();
            System.out.println("Agora informe o preço:");
            double price = sc.nextDouble();
            list.add(new Product(name, price));
        }

        List<String> names = list.stream().map(Product::upperCaseNonStatic).collect(Collectors.toList());
        names.forEach(System.out::println);

    }
}