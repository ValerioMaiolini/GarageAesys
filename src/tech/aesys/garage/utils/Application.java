package tech.aesys.garage.utils;

import java.util.Scanner;

import tech.aesys.garage.services.GarageManager;

public class Application {
	
	public static void start() {
		System.out.println("Benvenuto nel nostro garage!");
		GarageManager.initialization();
		menu();
	}
	
	public static void menu(){
		System.out.println("Cosa vuoi fare? (mostrare, estrarre, inserire, uscire)");
		Scanner scanner = new Scanner(System.in);
		String selected = scanner.nextLine();
		if (selected.equals("estrarre")) {
			GarageManager.extract();
			menu();
		} else if(selected.equals("inserire")) {
			System.out.println("la implementeremo...");
			menu();
		} else if (selected.equals("mostrare")) {
			GarageManager.showGarage();
			menu();
		} else if (selected.equals("uscire")) {
			close();
		} else {
			System.err.println("Comando non valido");
			menu();
		}
		scanner.close();
	}

	private static void close() {
		System.out.println("Arrivederci!");
	}
}

