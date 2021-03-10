package entities;

public class Individual extends TaxPayer {

	private Double heathExpenditures;

	public Individual () {
		
	}

	public Individual(String name, Double anualIncome, Double heathExpenditures) {
		super(name, anualIncome);
		this.heathExpenditures = heathExpenditures;
	}

	public Double getHeathExpenditures() {
		return heathExpenditures;
	}

	public void setHeathExpenditures(Double heathExpenditures) {
		this.heathExpenditures = heathExpenditures;
	}

	@Override
	public double tax() {
		double imposto;
		if (getAnualIncome() < 20000.00) {
			imposto = getAnualIncome() * 0.15;
		} else { imposto = getAnualIncome() * 0.25; }
		if (heathExpenditures > 0) {
			imposto =  imposto - (heathExpenditures/2);
		}
		return imposto;
	}
}
