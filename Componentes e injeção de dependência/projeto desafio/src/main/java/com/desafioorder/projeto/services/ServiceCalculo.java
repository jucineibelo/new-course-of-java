package com.desafioorder.projeto.services;

import com.desafioorder.projeto.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCalculo {
    @Autowired
    ServiceShipping serviceShipping;

    public double total(Order order) {
        System.out.println("Pedido código: " + order.getCodigo());
        return order.getValorBasico() - (order.getDesconto() / 100 * order.getValorBasico())
                + serviceShipping.TaxShipping(order);
    }
}
