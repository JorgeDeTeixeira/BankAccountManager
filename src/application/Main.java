package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = leitor.nextInt();
		leitor.nextLine();
		System.out.print("Holder: ");
		String holder = leitor.nextLine();
		System.out.print("Initial balance: ");
		double initial = leitor.nextDouble();
		System.out.print("Withdraw limit: ");
		double limit = leitor.nextDouble();

		Account acc = new Account(number, holder, initial, limit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = leitor.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.println("New balance R$:" + acc.getBalance());
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}

		leitor.close();
	}

}
