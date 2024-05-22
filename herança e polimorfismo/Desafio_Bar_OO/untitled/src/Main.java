import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bill bill = new Bill();

        System.out.println("Insira F para sexo feminino e M para sexo masculino:");
        bill.setGender(scanner.next().charAt(0));

        System.out.println("Quantidade de cervejas:");
        bill.setBeer(scanner.nextInt());

        System.out.println("Quantidade de refrigerantes:");
        bill.setSoftDrink(scanner.nextInt());

        System.out.println("Quantidade de espetinhos:");
        bill.setBerbecue(scanner.nextInt());

        System.out.println("RELATÓRIO:");
        System.out.println("Consumo: " + bill.feeding());
        if (bill.feeding() >= 30) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.println("Couvert: " + bill.cover());
        }
        System.out.println("Ingresso: " + bill.ticked());
        System.out.println("Valor a pagar = " + bill.total());
    }
}