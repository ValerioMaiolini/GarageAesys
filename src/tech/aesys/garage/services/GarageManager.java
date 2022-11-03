package tech.aesys.garage.services;

import java.util.Scanner;

import tech.aesys.garage.enums.CycleEnum;
import tech.aesys.garage.enums.PowerSupplyEnum;
import tech.aesys.garage.models.Car;
import tech.aesys.garage.models.Motorcycle;
import tech.aesys.garage.models.Van;

public class GarageManager {

	private static Garage garage = new GarageImp();

	public static void initialization() {
		garage.addVehicle(new Car("Ford Fiesta", 2006, 1200, 5, PowerSupplyEnum.DIESEL));
		garage.addVehicle(new Motorcycle("Kawasaki Ninja", 2020, 1500, CycleEnum.FOUR_STROKES));
		garage.addVehicle(new Car("Ferrari Testarossa", 2020, 1500, 3, PowerSupplyEnum.GASOLINE));
		garage.addVehicle(new Van("Doblò Cargo", 2020, 1500, 300));
		garage.addVehicle(new Motorcycle("Ducati Monster", 2022, 1500, CycleEnum.TWO_STROKES));
	}

	public static void extract() {
		garage.showGarage();
		System.out.println("Quale veicolo vuoi estrarre? ");
		Scanner scan = new Scanner(System.in);
		int vehicle = scan.nextInt();
		garage.extractVehicle(vehicle);
	}
	
	public static void insert() {
		System.out.println("Che veicolo vuoi inserire? (auto, van, moto)");
		Scanner scanner = new Scanner(System.in);
		String selected = scanner.nextLine();
		if (selected.equals("auto")) {
			System.out.println("Inserisci Brand:");
			String brand = scanner.nextLine();
			System.out.println("Inserisci Alimentazione:");
			String supply = scanner.nextLine();
			PowerSupplyEnum pSupply;
			if(supply.equals("benzina")) {
				pSupply = PowerSupplyEnum.GASOLINE;
			} else if (supply.equals("diesel")) {
				pSupply = PowerSupplyEnum.DIESEL;
			} else {
				System.out.println("Alimentazione non valida");
				return;
			}
			System.out.println("Inserisci Anno:");
			int year = scanner.nextInt();
			System.out.println("Inserisci Cilindrata:");
			int displacement = scanner.nextInt();
			System.out.println("Inserisci Numero di Porte:");
			int doors = scanner.nextInt();
			garage.addVehicle(new Car(brand, year, displacement, doors, pSupply));
		} else if(selected.equals("van")) {
			System.out.println("Inserisci Brand:");
			String brand = scanner.nextLine();
			System.out.println("Inserisci Anno:");
			int year = scanner.nextInt();
			System.out.println("Inserisci Cilindrata:");
			int displacement = scanner.nextInt();
			System.out.println("Inserisci Capacità:");
			int capacity = scanner.nextInt();
			garage.addVehicle(new Van(brand, year, displacement, capacity));
		} else if (selected.equals("moto")) {
			System.out.println("Inserisci Brand:");
			String brand = scanner.nextLine();
			System.out.println("Inserisci Anno:");
			int year = scanner.nextInt();
			System.out.println("Inserisci Cilindrata:");
			int displacement = scanner.nextInt();
			System.out.println("Inserisci Tempi:");
			int strokes = scanner.nextInt();
			CycleEnum cycle;
			if(strokes == 2) {
				cycle = CycleEnum.TWO_STROKES;
			} else if (strokes == 4) {
				cycle = CycleEnum.FOUR_STROKES;
			} else {
				System.out.println("Non valido");
				return;
			}
			garage.addVehicle(new Motorcycle(brand, year, displacement, cycle));
		}
	}
	
	public static void showGarage() {
		garage.showGarage();
	}
	
}
