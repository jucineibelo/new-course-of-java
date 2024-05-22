public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualInCome, Double healthExpenditures) {
        super(name, anualInCome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (getAnualInCome() < 20000.0) {
            return getAnualInCome() * 0.15 - healthExpenditures * 0.5;
        }
        else {
            return getAnualInCome() * 0.25 - healthExpenditures * 0.5;
        }
    }
}
