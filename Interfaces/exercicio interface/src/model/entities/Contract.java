package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Integer numero;
    private Date date;
    private Double totalValue;

    List<Installment> installments = new ArrayList<>();

    public Contract(){

    }

    public Contract(Integer numero, Date date, Double totalValue) {
        this.numero = numero;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getData() {
        return date;
    }

    public void setData(Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setValor(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
