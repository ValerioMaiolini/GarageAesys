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
	
	public static void showGarage() {
		garage.showGarage();
	}
	
}
