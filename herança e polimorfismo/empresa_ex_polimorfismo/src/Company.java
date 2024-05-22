public class Company extends TaxPayer {
    private int numberOfEmployer;

    public Company() {
        super();
    }

    public Company(String name, Double anualInCome, int numberOfEmployer) {
        super(name, anualInCome);
        this.numberOfEmployer = numberOfEmployer;
    }

    public Company(int numberOfEmployer) {
        this.numberOfEmployer = numberOfEmployer;
    }

    public int getNumberOfEmployer() {
        return numberOfEmployer;
    }

    public void setNumberOfEmployer(int numberOfEmployer) {
        this.numberOfEmployer = numberOfEmployer;
    }

    @Override
    public Double tax() {
        double pagamento = 0;
        if (numberOfEmployer <= 9) {
            pagamento = getAnualInCome() * 0.16;
        }
        if (numberOfEmployer >= 10) {
            pagamento = getAnualInCome() * 0.14;

        }
        return pagamento;
    }
}
