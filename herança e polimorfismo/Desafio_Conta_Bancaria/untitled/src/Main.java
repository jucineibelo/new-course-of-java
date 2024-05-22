import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Enter account number: ");
        int numeroConta = scan.nextInt();
        System.out.println("Enter account holder: ");
        String nome = scan.next();
        System.out.println("Is there na initial deposit (y/n)? y ");
        char initialDeposit = scan.next().charAt(0);

        if (initialDeposit == 'y') {
            System.out.println("Enter initial deposit value: ");
            double valor = scan.nextDouble();
            conta.cadastrarConta(numeroConta, nome, valor);
            System.out.println(conta);
        } else {
            conta.cadastrarConta(numeroConta, nome);
            System.out.println(conta);
        }

        System.out.println("Enter a deposit value: ");
        double deposito = scan.nextDouble();
        conta.depositar(deposito);
        System.out.println(conta);

        System.out.println("Enter a withdraw value: ");
        double sacar = scan.nextDouble();
        conta.sacar(sacar);
        System.out.println(conta);

        scan.close();

    }
}