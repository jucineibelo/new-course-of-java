import entities.Funcionario;
import services.ServiceImposto;
import services.ServicePrevidencia;
import services.ServiceSalario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome:");
        String nome = sc.next();
        System.out.println("Salário bruto:");
        double salarioBruto = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto);
        ServiceSalario serviceSalario = new ServiceSalario(new ServiceImposto(), new ServicePrevidencia());
        System.out.println(serviceSalario.salarioLiquido(funcionario));

    }
}