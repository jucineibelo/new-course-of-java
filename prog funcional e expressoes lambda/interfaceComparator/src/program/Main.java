package program;

import entities.MyComparator;
import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("tomate", 13.95));
        list.add(new Product("feijão", 7.50));
        list.add(new Product("arroz", 12.90));
        list.add(new Product("mandioca", 6.75));

        list.sort(new MyComparator());  //classe criada para implementar a interface comparator

        for (Product listas :list){
            System.out.println(listas);
            System.out.println("==============");
        }



    }
}