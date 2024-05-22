public class TaxPayer {
    private double salaryInCome;
    private double servicesInCome;
    private double capitalInCome;
    private double heathSpeding;
    private double educationSpeding;

    public TaxPayer() {
    }

    public TaxPayer(double salaryInCome, double servicesInCome, double capitalInCome, double heathSpeding, double educationSpeding) {
        this.salaryInCome = salaryInCome;
        this.servicesInCome = servicesInCome;
        this.capitalInCome = capitalInCome;
        this.heathSpeding = heathSpeding;
        this.educationSpeding = educationSpeding;
    }

    public double getSalaryInCome() {
        return salaryInCome;
    }

    public void setSalaryInCome(double salaryInCome) {
        this.salaryInCome = salaryInCome;
    }

    public double getServicesInCome() {
        return servicesInCome;
    }

    public void setServicesInCome(double servicesInCome) {
        this.servicesInCome = servicesInCome;
    }

    public double getCapitalInCome() {
        return capitalInCome;
    }

    public void setCapitalInCome(double capitalInCome) {
        this.capitalInCome = capitalInCome;
    }

    public double getHeathSpeding() {
        return heathSpeding;
    }

    public void setHeathSpeding(double heathSpeding) {
        this.heathSpeding = heathSpeding;
    }

    public double getEducationSpeding() {
        return educationSpeding;
    }

    public void setEducationSpeding(double educationSpeding) {
        this.educationSpeding = educationSpeding;
    }

    public double salaryTax() {
        if (salaryInCome <= 3000) {
            return 0;
        }
        if (salaryInCome > 3000 && salaryInCome <= 5000) {
            return 10;
        }
        if (salaryInCome > 5000) {
            return 20;
        }
        return 0;
    }

    public double servicesTax() {
        if (servicesInCome > 0) {
            return 15;
        }
        return 0;
    }

    public double capitalTax(){
        if (capitalInCome > 0){
            return 20;
        }
        return 0;
    }

    public double grossTax(){
        double total = 
        return 0;
    }

}

