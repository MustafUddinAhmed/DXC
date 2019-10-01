package day11;

public class Truck extends Vehicle {
	
	private int capacity;
	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(String color, int noOfWheel, String modelNumber) {
		super(color, noOfWheel, modelNumber);
		// TODO Auto-generated constructor stub
	}

	public Truck(int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Truck [capacity=" + capacity + ", getColor()=" + getColor() + ", getNoOfWheel()=" + getNoOfWheel()
				+ ", getModelNumber()=" + getModelNumber() + "]";
	}

}
