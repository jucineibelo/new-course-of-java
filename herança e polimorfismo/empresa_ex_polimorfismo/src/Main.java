import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers:");
        int numPayers = sc.nextInt();
        List<TaxPayer> list = new ArrayList<>();

        for (int i = 0; i < numPayers; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.println("Individual or company (i/c)?");
            char individualOrCompany = sc.next().charAt(0);
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Anual income:");
            double anualInCome = sc.nextDouble();

            if (individualOrCompany == 'i') {
                System.out.println("Health expenditures:");
                double heatExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualInCome, heatExpenditures));
            }
            if (individualOrCompany == 'c') {
                System.out.println("Health expenditures:");
                int numberOfEmplyer = sc.nextInt();
                list.add(new Company(name, anualInCome, numberOfEmplyer));
            }
        }

        System.out.println("TAXES PAID:");
        double soma = 0.0;
        for (TaxPayer totalTax : list) {
            System.out.println(totalTax.getName()+ ": $ " + String.format("%.2f", totalTax.tax()));
            soma += totalTax.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", soma));
        sc.close();




    }
}