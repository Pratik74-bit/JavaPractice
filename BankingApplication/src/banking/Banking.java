package banking;

import java.util.Scanner;

public class Banking {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int sent = 0;
		int size = 0;
		double[] accbalance = new double[250];
		String[] accnames = new String[250];
		while (sent != -1) {
		System.out.println("\nBank Admin Menu:");
		System.out.println("Please Enter Menu Option:");
		System.out.println("1. Add customer");
		System.out.println("2. Change customer name");
		System.out.println("3. Check Account Balance");
		System.out.println("4. Add Money to Account");
		System.out.println("5. Summary of all Accounts");
		
		System.out.println("-1. Quit");
		
		int userInp = input.nextInt();
		
		
		if (userInp == 1) {
			System.out.println("Add Customer Menu:");
			
			System.out.println("Please Enter Customer name :");
			input.nextLine();
			String name = input.nextLine();
			accnames[size] = name;
			
			System.out.println("Please Enter Account balance :");
			double balance = input.nextDouble();
			accbalance[size] = balance;
			
			System.out.println("Account No. is :" + size);
			size = size + 1;
			
		}
		else if (userInp == 2) {
			System.out.println("Change Customer Name Menu:");
			
			System.out.println("Please Enter Account No to change name :");
			int index = input.nextInt();
			
			input.nextLine();
			System.out.println("Please Enter Customer's new name :");
			accnames[index] = input.nextLine();
			
		}
		else if (userInp == 3) {
			System.out.println("Check Customer Balance Menu:");
			
			System.out.println("Please Enter Account No to check balance :");
			int index = input.nextInt();
			double balance = accbalance[index];
			System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.println("The " + accnames[index] + " has balance Rs " + balance + " in their account.");
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		}
		else if (userInp == 4) {
			System.out.println("Check Customer Balance Menu:");
			
			System.out.println("Please Enter Account No. to Add balance :");
			int index = input.nextInt();
			System.out.println("Please Enter new balance of customer :");
			double newbal = accbalance[index];
			accbalance[index] = newbal + input.nextDouble();
		}
		else if (userInp == 5) {
 		System.out.println("Summary of all accounts in bank:");
			double total = 0;

			for (int i=0; i<size; i++) {
				total = total + accbalance[i];
				System.out.println("\n"+(i+1) +") " + accnames[i] + " has Rs "+ accbalance[i]);
				}
			System.out.println("\nTotal balance in Bank is :" + total);
		}
		else if (userInp == -1) {
			System.out.println("\nThank you...!");
			System.exit(-1);
		}
		

		else {
			System.out.println("Please Enter Valid Input:");
			}
		}
	}

}
