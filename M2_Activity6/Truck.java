package M2_Activity6;

/*
** This is a concrete class, it is a Vehicle and it is Refuelable
*/
public class Truck extends Vehicle implements Refuelable{

	public Truck() {
		this.setBrand("Volvo");
		this.setNumberOfWheels(12);
	}
	
	@Override
	public void startEngine() {
		System.out.println(this.getNumberOfWheels() + " wheeled " + this.getBrand() + " engine started.");
	}
	
	@Override
	public void refuel() {
		System.out.println(this.getNumberOfWheels() + " wheeled " + this.getBrand() + " refueled.");
	}
}