package fr.fms.bank;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import fr.fms.bankjob.BankJobImpl;
import fr.fms.entities.BankAccount;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.Customer;
import fr.fms.entities.SavingAccount;
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
				
				System.out.println("Type de compte :\n 1 - compte courant\n 2 - compte épargne");
				int inputTypeAccount = sc.nextInt();
				
				Date today = new Date();
				String formattedDate = new SimpleDateFormat("dd-MM-yyyy").format(today);
				
				BankAccount bankAccount = null; 
				
				if (inputTypeAccount == 1) {
				    System.out.println("Entrer découvert autorisé");
				    double overDraft = sc.nextDouble();
				    bankAccount = new CurrentAccount((long) (Math.random() * 100000) + 1, balance, customer.getCustomerId(), formattedDate, overDraft);
				    System.out.println("Compte courant créé avec un découvert autorisé de : " + overDraft);
				} 
				else if (inputTypeAccount == 2) {
				    System.out.println("Entrer taux d'intérêt");
				    double interestRate = sc.nextDouble();
				    bankAccount = new SavingAccount((long) (Math.random() * 100000) + 1, balance, customer.getCustomerId(), formattedDate, interestRate);
				    System.out.println("Compte épargne créé avec un taux d'intérêt de : " + interestRate);
				}
				
				job.addAccountToCustomer(customer, bankAccount);
				
				sc.nextLine();
				
				System.out.println("Souhaitez-vous revenir au menu ? O ou N");
				displayMenu = sc.nextLine();
				break;
			}
			case 4: {
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
