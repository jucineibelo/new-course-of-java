package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double parcelaBasica = contract.getTotalValue() / months;
        //parcela basica vale 200 no exemplo

        for (int i = 1; i <= months; i++) {
            double updateParcela = parcelaBasica + onlinePaymentService.interest(parcelaBasica, i);      //updateParcela vai valer  = 202,0
            double updateFullParcela = updateParcela + onlinePaymentService.paymentFee(parcelaBasica);   //fullParcela vai valer 206,04
            Date dueDate = addMonths(contract.getData(), i);
            contract.getInstallments().add(new Installment(dueDate, updateFullParcela));

        }
    }

    private Date addMonths(Date date, int N) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, N);
        return calendar.getTime();
    }
}
