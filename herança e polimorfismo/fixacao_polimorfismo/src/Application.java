import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Application {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the number of products:");
        int numProdutos = scanner.nextInt();

        List<Product> list = new ArrayList<>();

        for (int i = 0; i < numProdutos; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.println("Common, used or imported (c/u/i)?");
            char tipoProduto = scanner.next().charAt(0);
            System.out.println("Name");
            String name = scanner.next();
            System.out.println("Price:");
            double price = scanner.nextDouble();

            if (tipoProduto == 'c') {
                list.add(new Product(name, price));
            } else if (tipoProduto == 'i') {
                System.out.println("Customs fee:");
                double customsFee = scanner.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else if (tipoProduto == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY):");
                String dateImput = scanner.next();
                Date manufactureDate = sdf.parse(dateImput);
                list.add(new UsedProduct(name, price, manufactureDate));
            }
        }

        System.out.println("PRICE TAGS:");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }


    }
}
