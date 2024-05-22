package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cliente data ");
        System.out.println("Name:");
        String nomeCliente = scanner.next();
        System.out.println("E-mail:");
        String email = scanner.next();
        System.out.println("Birth date (DD/MM/YYY)");
        Date aniversario = sdf.parse(scanner.next());

        Client client = new Client(nomeCliente, email, aniversario);

        System.out.println("Enter order data:");
        System.out.println("Status (0 - PENDING_STATUS, 1 - PROCESSING, 2 - SHIPPED, 3 - DELIVERED):");
        OrderStatus status = OrderStatus.valueOf(scanner.next()); //recebendo o enumerado no metodo scanner
        System.out.println("How many items to this order?");
        int numOfOrders = scanner.nextInt();

        Order order = new Order(new Date(), status, client);

        for (int i = 1; i <= numOfOrders; i++) {
            System.out.println("Enter #" + i + " item data");
            System.out.println("Product name:");
            String nomeProduto = scanner.next();
            System.out.println("Product price:");
            double precoProduto = scanner.nextDouble();
            System.out.println("Quantity:");
            int qtdProduto = scanner.nextInt();

            Product product = new Product(nomeProduto, precoProduto);
            OrderItem orderItem = new OrderItem(qtdProduto, precoProduto, product);
            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMARY");
        System.out.println(order);


    }
}