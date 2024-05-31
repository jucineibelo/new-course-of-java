package program;

import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> lista = new ArrayList<>();

        lista.add(new Product(1, "arroz", 5.0));
        lista.add(new Product(2, "feijão", 9.0));
        lista.add(new Product(3, "batata", 3.0));

        Collections.sort(lista); //pra eu usar sort que seria um ordenamento sou obrigado a implementar a interface comparable na classe product 

        for(Product list : lista){
            System.out.println(list);
        }


    }
}