package program;

import entities.Product;
import util.FuncaoProduto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Arroz", 13.90));
        list.add(new Product("Feijão", 9.90));
        list.add(new Product("Banana", 5.00));
        list.add(new Product("Abacaxi", 10.00));
        list.add(new Product("Amendoim", 13.90));
        list.add(new Product("Buritos", 59.00));

        FuncaoProduto funcaoSoma = new FuncaoProduto();

        double soma = funcaoSoma.filterListSum(list);

        double somaDois = funcaoSoma.filterListSumPricate(list, p -> p.getName().charAt(0) == 'A');

        System.out.println(soma);
        System.out.println(somaDois);


    }
}