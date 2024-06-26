package com.devsuperior.services;

import com.devsuperior.entities.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceSalario {

    @Autowired
    private ServiceImposto serviceImposto;  // com o @Autowired não precisa declarar o construtor

    @Autowired
    private ServicePrevidencia servicePrevidencia;

//    public ServiceSalario(ServiceImposto serviceImposto, ServicePrevidencia servicePrevidencia) {
//        this.serviceImposto = serviceImposto;
//        this.servicePrevidencia = servicePrevidencia;
//    }

    public double salarioLiquido(Funcionario funcionario) {
        return funcionario.getSalarioBruto() - serviceImposto.taxaImposto(funcionario.getSalarioBruto())
                - servicePrevidencia.taxaPrevidencia(funcionario.getSalarioBruto());
    }


}
