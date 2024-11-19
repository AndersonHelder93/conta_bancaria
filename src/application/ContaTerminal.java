package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dates;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		Dates dates;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.println();
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			dates = new Dates(number, name, initialDeposit);
		}else {
			dates = new Dates(number, name);
		}
		
		System.out.println();
		System.out.print("Acount data: ");
		System.out.print(dates);
		
		System.out.println();
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		dates.depositValue(deposit);
		System.out.print("Updated account data: ");
		System.out.println(dates);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		dates.withdrawValue(withdraw);
		System.out.print("Update account data:  ");
		System.out.println(dates);
		
		sc.close();
		
	}

}
