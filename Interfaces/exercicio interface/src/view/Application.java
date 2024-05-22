package view;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.println("Numero:");
        int numero = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy):");
        Date date = sdf.parse(sc.next());
        System.out.println("Valor do contrato:");
        double valorContrato = sc.nextDouble();
        Contract contract = new Contract(numero, date, valorContrato);

        System.out.println("Entre com o numero de parcelas:");
        int parcelamento = sc.nextInt();

        ContractService cs = new ContractService(new PaypalService());
        cs.processContract(contract, parcelamento);
        System.out.println("Installment:");

        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }


    }
}
