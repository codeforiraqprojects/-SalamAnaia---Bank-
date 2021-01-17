package account1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i;
		Bank t = new Bank();
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter your name:");
		t.name = s.nextLine();
		System.out.print("Please enter your account number:");
		t.acc_no = s.nextInt();
		System.out.print("Please enter your amount:");
		t.amount = s.nextFloat();
		do {
		System.out.println("=========================");
		System.out.println("Please choose a method:");
		System.out.println("1.Deposite.");
		System.out.println("2.Withdraw.");
		System.out.println("3.Show balance.");
		System.out.println("4.Show info.");
		i = s.nextInt();
		switch(i) {
		case 1:
			System.out.println("Please enter the amount");
			float a = s.nextFloat();
			t.deposit(a);
			break;
		case 2:
			System.out.println("Please enter the amount");
			a = s.nextFloat();
			t.withdraw(a);
			break;
		case 3:
			t.checkBalance();
			break;
		case 4:
			t.display();
			break;
		}
	}
	while(i<5);

	}}
