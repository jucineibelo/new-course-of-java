package com.desafioorder.projeto.services;

import com.desafioorder.projeto.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ServiceShipping {

    public Double TaxShipping(Order order) {
        double frete = 0;

        if (order.getValorBasico() < 100.0) {
            frete = 20.0;
        } else if (order.getValorBasico() > 100.0 && order.getValorBasico() < 200) {
            frete = 12.0;
        } else {
            frete = 0.0;
        }
        return frete;
    }

}
