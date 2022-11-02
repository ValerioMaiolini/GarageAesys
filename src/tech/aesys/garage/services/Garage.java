package tech.aesys.garage.services;

import tech.aesys.garage.models.Vehicle;

public interface Garage {

	Vehicle addVehicle(Vehicle vehicle);

	void extractVehicle(int index);

	void showGarage();
	
	boolean isEmpty();

}