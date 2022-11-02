package tech.aesys.garage.enums;

public enum PowerSupplyEnum {

	DIESEL("Diesel"),
	GASOLINE("Gasoline");

	private final String value;
	
	PowerSupplyEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
