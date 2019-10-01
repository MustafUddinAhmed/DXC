package day11;

public class Car extends Vehicle {
	private int numOfSeat;
	private boolean isSUV;

	public Car() {
		// TODO Auto- constructor stub
	}

	public Car(String color, int noOfWheel, String modelNumber) {
		super(color, noOfWheel, modelNumber);
		// TODO Auto-generated constructor stub
	}

	public Car(int numOfSeat, boolean isSUV) {
		super();
		this.numOfSeat = numOfSeat;
		this.isSUV = isSUV;
	}

	public int getNumOfSeat() {
		return numOfSeat;
	}

	public void setNumOfSeat(int numOfSeat) {
		this.numOfSeat = numOfSeat;
	}

	public boolean isSUV() {
		return isSUV;
	}

	public void setSUV(boolean isSUV) {
		this.isSUV = isSUV;
	}

	@Override
	public String toString() {
		return "Car [numOfSeat=" + numOfSeat + ", isSUV=" + isSUV + ", getColor()=" + getColor() + ", getNoOfWheel()="
				+ getNoOfWheel() + ", getModelNumber()=" + getModelNumber() + "]";
	}
	
	

}
