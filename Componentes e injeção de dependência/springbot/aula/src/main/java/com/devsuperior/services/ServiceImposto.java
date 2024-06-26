package com.devsuperior.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceImposto {

    public double taxaImposto(Double salario) {
        return salario * 0.2;
    }


}
