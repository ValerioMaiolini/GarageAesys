package tech.aesys.garage.services;

import tech.aesys.garage.models.Vehicle;

public class GarageImp implements Garage {

	private Vehicle[] garage = new Vehicle[15];

	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		boolean inserted = false;
		for(int i=0; i<garage.length && !inserted; i++) {
			if(garage[i] == null) {
				garage[i] = vehicle;
				inserted = true;
				return vehicle;
			}
		} return null;
	}
	
	@Override
	public void extractVehicle(int index) {
		showGarage();
		if (garage[index] != null) {
			System.out.println();
			System.out.println("------");
			System.out.println("Vehicle " + garage[index].getBrand() + " extracted");
			System.out.println("------");
			setSlot(index, null);
		}
	}
	
	@Override
	public void showGarage() {
		System.out.println("Garage situation:");
		if (isEmpty()) {
			System.out.println("Nessun veicolo presente");
		} else {			
			for (int i = 0; i < garage.length; i++) {
				if (garage[i] != null) {				
					System.out.println(String.format("[%s] - %s", i, garage[i]));
				}			
			}
		}
	}
	
	@Override
	public boolean isEmpty() {
		if (count()>0) {
			return false;
		} return true;
	}
	
	private int count() {
		int counter = 0;
		for(Vehicle vehicle  : garage) {
			if(vehicle != null) {
				counter++;
			}
		}
		return counter;
	}
	
	private void setSlot(int index, Vehicle vehicle) {
		this.garage[index] = vehicle;
	}
	
}
