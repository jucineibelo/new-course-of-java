import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeProduto;
        double precoCompra;
        double precoVenda;
        double lucro = 0;
        ArrayList<Comerciante> listaComerciante = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos produtos deseja cadastrar:");
        int numeroProdutos = scanner.nextInt();

        for (int i = 0; i < numeroProdutos; i++) {
            System.out.println("Produto: " + i);
            System.out.println("Nome do produto:");
            nomeProduto = scanner.next();
            System.out.println("Preço de compra:");
            precoCompra = scanner.nextDouble();
            System.out.println("Preço de venda:");
            precoVenda = scanner.nextDouble();
            Comerciante comerciante = new Comerciante(nomeProduto, precoCompra, precoVenda);
            listaComerciante.add(comerciante);
        }

        for (int j = 0; j < numeroProdutos; j++) {
            System.out.println(listaComerciante.get(j).toString());
        }

        for (Comerciante comerciante : listaComerciante) {
            System.out.println(comerciante.toString());

        }

    }
}