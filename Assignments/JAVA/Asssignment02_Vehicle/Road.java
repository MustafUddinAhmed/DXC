package day11;

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck= new Truck("Red", 8, "AB123-5");
		truck.setCapacity(100000);
		System.out.println(truck);
		
		Bus bus= new Bus("White", 6, "BB189-1");
		bus.setBusFare(100);
		bus.setBusId(1001);
		System.out.println(bus);
		
		Car car= new Car("Blue", 4, "Q3");
		car.setNumOfSeat(4);
		car.setSUV(false);
		System.out.println(car);

	}

}
