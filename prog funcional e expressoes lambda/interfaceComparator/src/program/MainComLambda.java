package program;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainComLambda {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("tomate", 13.95));
        list.add(new Product("feijão", 7.50));
        list.add(new Product("arroz", 12.90));
        list.add(new Product("mandioca", 6.75));

        Comparator<Product> comparator = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        //reduzindo essa expressão lambda acima  pois só tem uma linha de código

        Comparator<Product> comparator2 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort(comparator2);

        for (Product listas : list) {
            System.out.println(listas);
            System.out.println("==============");
        }
    }
}