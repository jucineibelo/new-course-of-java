import java.util.ArrayList;
import java.util.List;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        System.out.println("Enter the number of employees:");
        int numberEmployees = scanner.nextInt();

        for (int i = 0; i < numberEmployees; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.println("Outsourced (y/n)?");
            char outsourced = scanner.next().charAt(0);


            if (outsourced == 'y') {
                System.out.println("Name: ");
                String name = scanner.next();
                System.out.println("Hours");
                int hours = scanner.nextInt();
                System.out.println("Value per hour:");
                double valuePerHour = scanner.nextDouble();
                System.out.println("Additional charge:");
                double addCharge = scanner.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));

            } else {
                System.out.println("Name: ");
                String name = scanner.next();
                System.out.println("Hours");
                int hours = scanner.nextInt();
                System.out.println("Value per hour:");
                double valuePerHour = scanner.nextDouble();
                ;
                list.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println("PAYMENTS:");

        for (Employee teste : list) {
            System.out.println(teste.getName() + " - $ " + String.format("%.2f", teste.payment()));

        }

    }

}

