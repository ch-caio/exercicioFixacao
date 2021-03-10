package entities;

public class Company extends TaxPayer {

	private int numberOfEmployees;
	
	public Company () {
		
	}
	
	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double imposto;
		if (numberOfEmployees < 10) {
			imposto = this.getAnualIncome() * 0.16;
		} else { imposto = this.getAnualIncome() * 0.14;
		
		}
		return imposto;
	}

}
