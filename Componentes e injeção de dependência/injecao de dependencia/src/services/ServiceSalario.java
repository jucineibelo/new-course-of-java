package services;

import entities.Funcionario;

public class ServiceSalario {
    private ServiceImposto serviceImposto;
    private ServicePrevidencia servicePrevidencia;

    public ServiceSalario(ServiceImposto serviceImposto, ServicePrevidencia servicePrevidencia) {
        this.serviceImposto = serviceImposto;
        this.servicePrevidencia = servicePrevidencia;
    }

    public double salarioLiquido(Funcionario funcionario) {
        return funcionario.getSalarioBruto() - serviceImposto.taxaImposto(funcionario.getSalarioBruto())
                - servicePrevidencia.taxaPrevidencia(funcionario.getSalarioBruto());
    }


}
