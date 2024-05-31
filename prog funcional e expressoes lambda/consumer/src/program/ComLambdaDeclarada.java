package program;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ComLambdaDeclarada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 280.00));
        list.add(new Product("Teclado", 500.00));

        Consumer<Product> teste = p -> {
            p.setPrice(p.getPrice() * 1.1);
        };

        list.forEach(teste);

        list.forEach(System.out::println);
    }
}