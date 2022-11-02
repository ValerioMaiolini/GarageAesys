package tech.aesys.garage.enums;

public enum CycleEnum {

	TWO_STROKES(2),
	FOUR_STROKES(4);
	
	private final int value;
	
	CycleEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
