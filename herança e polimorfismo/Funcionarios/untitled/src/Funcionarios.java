public class Funcionarios {
    private String name;
    private double grossSalary;
    private double tax;

    public Funcionarios() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double netSalary() {
        double liquido = grossSalary - tax;
        return liquido;
    }

    public void IncreaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100;
    }
    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
