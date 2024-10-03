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
		int choice = 0; 
		
		while (choice != 6) {
			Utils.displayMenu();
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			
			case 1: {
				System.out.println("Entrer prenom client");
				String firstname = sc.nextLine();
				System.out.println("Entrer nom client");
				String lastname = sc.nextLine();
				System.out.println("Entrer email client");
				String email = sc.nextLine();
				job.addCustomerToBank(lastname, firstname, email);
				break;
			}
			
			case 2: {
				System.out.println("Entrer ID client");
				long customerId = sc.nextLong();
				sc.nextLine();
				Customer customer = job.findCustomer(customerId);
				if (customer == null) {
					System.err.println("n existe pas");
			        break;
				}
				System.out.println("Entrer un solde");
				double balance = sc.nextDouble();
				System.out.println("Type de compte" +"\n"+ " 1 - compte courant"+"\n"+"2 - compte epargne");
				String accountType = null;
				int inputTypeAccount = sc.nextInt();			
				if (inputTypeAccount == 1 ) accountType = "currentAccount";
				else if (inputTypeAccount == 2) accountType = "savingAccount";
				job.addAccountToCustomer(accountType, balance, customer);
				sc.nextLine();
				break;
			}
			case 3: 
				System.out.println("Entrer ID client");
				long customerId = sc.nextLong();
				System.out.println("Entre le compte courant ou le compte épargne");
				long bankAccountId = sc.nextLong();
				System.out.println("Le type de transaction : 1 - versement, 2 - retrait, 3 - transfert");
				int type = sc.nextInt();
				switch (type) {
				case 1:
					System.out.println("Saisir le montant à ajouter au solde du compte");
					int amount = sc.nextInt();
					break;
				}
			case 6:
				System.out.println("Aurevoir");
				break;
			default:
				System.out.println("Choix non valide");
			}
		}
		sc.close();
	}
}
