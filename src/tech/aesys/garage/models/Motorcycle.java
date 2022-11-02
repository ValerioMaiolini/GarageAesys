package tech.aesys.garage.models;

import tech.aesys.garage.enums.CycleEnum;

public class Motorcycle extends Vehicle {

	private CycleEnum cycle;

	public Motorcycle(String brand, int year, int displacement, CycleEnum cycle) {
		super(brand, year, displacement);
		this.cycle = cycle;
	}

	public CycleEnum getCylce() {
		return cycle;
	}

	public void setCylce(CycleEnum cylce) {
		this.cycle = cylce;
	}

	@Override
	public String toString() {
		return 	"Motorcycle - " +
				super.toString() + 
				String.format("Engine Cycles: %s", cycle.getValue());
	}
	
}
