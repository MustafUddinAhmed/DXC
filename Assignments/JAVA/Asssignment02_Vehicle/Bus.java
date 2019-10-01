package day11;

public class Bus extends Vehicle {

	private int busId;
	private int busFare;
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(String color, int noOfWheel, String modelNumber) {
		super(color, noOfWheel, modelNumber);
		// TODO Auto-generated constructor stub
	}

	public Bus(int busId, int busFare) {
		super();
		this.busId = busId;
		this.busFare = busFare;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public int getBusFare() {
		return busFare;
	}

	public void setBusFare(int busFare) {
		this.busFare = busFare;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busFare=" + busFare + ", getColor()=" + getColor() + ", getNoOfWheel()="
				+ getNoOfWheel() + ", getModelNumber()=" + getModelNumber() + "]";
	}

	
}
