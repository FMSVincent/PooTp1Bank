package fr.fms.utils;

public class Utils {
	// properties
	static String[] menuMain = {"1 - Creer clients", "2 - Creer un compte client", "3 - Afficher la liste des comtpes"};

	// methodes
	public static void displayMenu() {
		System.out.println("*****************************");
		System.out.println("\r\n"
				+ " |  \\/  |                 \r\n"
				+ " | \\  / | ___ _ __  _   _ \r\n"
				+ " | |\\/| |/ _ \\ '_ \\| | | |\r\n"
				+ " | |  | |  __/ | | | |_| |\r\n"
				+ " |_|  |_|\\___|_| |_|\\__,_|\r\n");
		for (String title : menuMain) {
			System.out.println(title);
		}
		System.out.println("*****************************");
	}
	
	public static void displayTitle() {
		System.out.println("  ____                  ____       _   ____                  _ \r\n"
				+ " / ___|__ _ ___  __ _  |  _ \\  ___| | |  _ \\ __ _ _ __   ___| |\r\n"
				+ "| |   / _` / __|/ _` | | | | |/ _ \\ | | |_) / _` | '_ \\ / _ \\ |\r\n"
				+ "| |__| (_| \\__ \\ (_| | | |_| |  __/ | |  __/ (_| | |_) |  __/ |\r\n"
				+ " \\____\\__,_|___/\\__,_| |____/ \\___|_| |_|   \\__,_| .__/ \\___|_|\r\n"
				+ "                                                 |_|           ");
		System.out.println(" ____              _    \r\n"
				+ "| __ )  __ _ _ __ | | __\r\n"
				+ "|  _ \\ / _` | '_ \\| |/ /\r\n"
				+ "| |_) | (_| | | | |   < \r\n"
				+ "|____/ \\__,_|_| |_|_|\\_\\");
	}
	
}
