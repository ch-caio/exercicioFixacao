package exercicioFixacao134;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <TaxPayer> list = new ArrayList<>();
		
		double soma=0.0;
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" +i+ " data:");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (ch == 'c') {
				System.out.println("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double heathExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, heathExpenditures));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tb : list) {
			System.out.println("NAME: " +tb.getName()+ "\nINCOME: $" + String.format("%.2f",tb.tax()));
			soma += tb.tax();
			System.out.println();
		}
		System.out.println();
		System.out.println("Total taxes: " + String.format("%.2f", soma));
		sc.close();
	}

}
