package M2_Activity6;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.startEngine();
		car.refuel();
		
		Truck truck = new Truck();
		truck.startEngine();
		truck.refuel();
		
		destroyVehicle(car);
		destroyVehicle(truck);
	}
	
	public static void destroyVehicle(Vehicle vehicle) {
		vehicle.Destroy();
	}

}