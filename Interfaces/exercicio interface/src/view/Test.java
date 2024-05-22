package view;

import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

public class Test {
    public static void main(String[] args) {

        //testando a classe que implementa a interface
        OnlinePaymentService test = new PaypalService();
        System.out.println(test.interest(200.0, 3));
        System.out.println(test.paymentFee(200.0));

        OnlinePaymentService ps = new PaypalService(); //injeção de dependencia (tiro a responsabilidade da classe instanciar e coloco no programa principal
        ContractService contractService = new ContractService(ps);

    }
}