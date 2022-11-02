package tech.aesys.garage.models;

public class Van extends Vehicle {

	private double capacity;

	public Van(String brand, int year, int displacement, double capacity) {
		super(brand, year, displacement);
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return  "Van - " + 
				super.toString() + 
				String.format("Capacity: %s", capacity);
	}
	
}
