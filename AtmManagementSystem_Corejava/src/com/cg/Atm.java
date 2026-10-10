package com.cg;

import java.util.Scanner;

public class Atm {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		UserServiceimp usi=new UserServiceimp();
		System.out.println("=====Welcome to java ATM====");
		System.out.println("Enter User ID: ");
		String UserId=sc.nextLine();
		System.out.println("Enter Pin: ");
		String Pin=sc.nextLine();
		 try {
				User u = usi.login(UserId, Pin);
	            AtmOperation atm = new AtmOperationimp(u);
	            int option;

	            do {
	                System.out.println("\n--- Menu ---");
	                System.out.println("1. Check Balance");
	                System.out.println("2. Deposit");
	                System.out.println("3. Withdraw");
	                System.out.println("4. Mini Statement");
	                System.out.println("5. Exit");
	                System.out.print("Choose option: ");
	                option = sc.nextInt();

	                switch (option) {
	                    case 1:
	                        atm.checkBalance();
	                        break;
	                    case 2:
	                        System.out.print("Enter deposit amount: ");
	                        double deposit = sc.nextDouble();
	                        atm.deposit(deposit);
	                        break;
	                    case 3:
	                        System.out.print("Enter withdrawal amount: ");
	                        double withdraw = sc.nextDouble();
	                        try {
	                            atm.withdraw(withdraw);
	                        } catch (InsufficientFundException e) {
	                            System.out.println(e.getMessage());
	                        }
	                        break;
	                    case 4:
	                        atm.miniStatement();
	                        break;
	                    case 5:
	                        System.out.println("Thank you for using our ATM!");
	                        break;
	                    default:
	                        System.out.println("Invalid option.");
	                }
	            } while (option != 5);

	        } catch (InvalidPinException e) {
	            System.out.println(e.getMessage());
	        }

	        sc.close();
	    }
	}


