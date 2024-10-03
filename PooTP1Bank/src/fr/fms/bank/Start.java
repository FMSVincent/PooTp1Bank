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

				break;
			}
			
			case 3: 
				System.out.println("Le type de transaction : 1 - versement, 2 - retrait, 3 - transfert");
				int type = sc.nextInt();
				switch (type) {
					case 1:
						System.out.println("Saisir l ID du compte a créditer");
						int accountId = sc.nextInt();
						System.out.println("Saisir le montant à ajouter au solde du compte");
						int amount = sc.nextInt();
						String isSuccess = (job.makeDeposit(accountId, amount)) ? "montant de:" + amount + " € ajouté avec succès" : "action échouée";
						System.out.println(isSuccess);
						break;
				}
			case 4:
				job.getListBankAccount();
				break;
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
