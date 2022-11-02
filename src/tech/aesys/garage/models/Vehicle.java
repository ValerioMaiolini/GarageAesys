package tech.aesys.garage.models;

public abstract class Vehicle {

	private String brand;
	private int year;
	private int displacement;
	
	public Vehicle(String brand, int year, int displacement) {
		this.brand = brand;
		this.year = year;
		this.displacement = displacement;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	@Override
	public String toString() {
		return String.format("Brand: %s - Year: %s - Displacement: %s - ",
				brand, year, displacement);
	}
	
}
