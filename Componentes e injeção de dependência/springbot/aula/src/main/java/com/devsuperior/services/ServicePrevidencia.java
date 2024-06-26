package com.devsuperior.services;

import org.springframework.stereotype.Service;

@Service
public class ServicePrevidencia {

    public double taxaPrevidencia(Double salario) {
        return salario * 0.10;
    }

}
