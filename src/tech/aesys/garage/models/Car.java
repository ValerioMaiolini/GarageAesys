package tech.aesys.garage.models;

import tech.aesys.garage.enums.PowerSupplyEnum;

public class Car extends Vehicle {

	private int doors;
	private PowerSupplyEnum powerSupply;
	
	public Car(String brand, int year, int displacement, int doors, PowerSupplyEnum powerSupply) {
		super(brand, year, displacement);
		this.doors = doors;
		this.powerSupply = powerSupply;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public PowerSupplyEnum getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(PowerSupplyEnum powerSupply) {
		this.powerSupply = powerSupply;
	}

	@Override
	public String toString() {
		return  "Car - " + 
				super.toString() + 
				String.format("Doors: %s - Power Supply: %s", doors, powerSupply.getValue());
	}
	
}
