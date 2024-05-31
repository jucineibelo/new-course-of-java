package program;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ComMetodoNaoEstatico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 280.00));
        list.add(new Product("Teclado", 500.00));

        list.forEach(Product::updatePriceNaoEstatico);
        list.forEach(System.out::println);
    }
}