package M2_Activity6;
/*
** This is a concrete class, it is a Vehicle and it is Refuelable
*/
public class Car extends Vehicle implements Refuelable{
	
	public Car() {
		this.setBrand("Toyota");
		this.setNumberOfWheels(4);
			
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