import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionarios f = new Funcionarios();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        f.setName(sc.next());
        System.out.println("Informe seu salário bruto: ");
        f.setGrossSalary(sc.nextDouble());
        System.out.println("Informe quanto é o imposto: ");
        f.setTax(sc.nextDouble());
        System.out.println(f);

        System.out.println("Qual a porcentagem para aumentar o salário?");
        double porcentagem = sc.nextDouble();
        f.IncreaseSalary(porcentagem);
        System.out.println("Dados atualizados: " + f.netSalary());


    }
}
