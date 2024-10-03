package fr.fms.bank;

import java.util.Scanner;

import fr.fms.bankjob.BankJobImpl;
import fr.fms.entities.Customer;
import fr.fms.utils.Utils;

public class Start {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankJobImpl job = new BankJobImpl();
		Utils.displayTitle();
		String displayMenu = "o"; 
		
		while (displayMenu.equalsIgnoreCase("o")) {
			Utils.displayMenu();
			int inputUserOption = sc.nextInt();
			sc.nextLine();
			
			switch (inputUserOption) {
			
			case 1: {
				System.out.println("Entrer prenom client");
				String firstname = sc.nextLine();
				System.out.println("Entrer nom client");
				String lastname = sc.nextLine();
				System.out.println("Entrer email client");
				String email = sc.nextLine();
				job.addCustomerToBank(lastname, firstname, email);
				System.out.println("Souhaitez-vous revenir au menu ? O ou N");
				displayMenu = sc.nextLine();
				break;
			}
			
			case 2: {
				System.out.println("Entrer ID client");
				long customerId = sc.nextLong();
				sc.nextLine();
				Customer customer = job.findCustomer(customerId);
				if (customer == null) {
					System.err.println("n existe pas");
			        System.out.println("Souhaitez-vous revenir au menu ? O ou N");
			        displayMenu = sc.nextLine();
			        break;
				}
				System.out.println("Entrer un solde");
				double balance = sc.nextDouble();
				System.out.println("Type de compte" +"\n"+ " 1 - compte courant"+"\n"+"2 - compte epargne");
				String accountType = null;
				int inputTypeAccount = sc.nextInt();
				int overDraftOrInterest = 0;
				if (inputTypeAccount == 1 ) {
					System.out.println("Entrer découvert autorisé");
					overDraftOrInterest = sc.nextInt();
					accountType = "currentAccount";
				} 
				else if (inputTypeAccount == 2) accountType = "savingAccount";
				job.addAccountToCustomer(accountType, balance, customer, overDraftOrInterest);
				sc.nextLine();
				System.out.println("Souhaitez-vous revenir au menu ? O ou N");
				displayMenu = sc.nextLine();
				break;
			}
			case 3: {
				job.getListBankAccount();
				System.out.println("Souhaitez-vous revenir au menu ? O ou N");
				displayMenu = sc.nextLine();
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: "+ inputUserOption);
			}
		}
		sc.close();
	}
}
