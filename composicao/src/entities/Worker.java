package entities;

import entities.enuns.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract contract : contracts) {
            calendar.setTime(contract.getDate());
            int contractYear = calendar.get(Calendar.YEAR);
            int contractMonth = 1 + calendar.get(Calendar.MONTH);
            if (contractYear == year && contractMonth == month) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}

//No construtor não seta lista e também não se utiliza o metodo setLista porque é criada uma lista e adicionado ou excluido indices o metodo set iria substituir a lista
// e não é o comportamento esperado.