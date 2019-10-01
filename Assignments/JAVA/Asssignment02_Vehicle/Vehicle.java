package day11;

public class Vehicle {
	
	private String color;
	private int noOfWheel;
	private String modelNumber;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
		color="red";
		noOfWheel=4;
		modelNumber= "A2019-12";
	}

	public Vehicle(String color, int noOfWheel, String modelNumber) {
		super();
		this.color = color;
		this.noOfWheel = noOfWheel;
		this.modelNumber = modelNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfWheel() {
		return noOfWheel;
	}

	public void setNoOfWheel(int noOfWheel) {
		this.noOfWheel = noOfWheel;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", noOfWheel=" + noOfWheel + ", modelNumber=" + modelNumber + "]";
	}
	
	
	

}
