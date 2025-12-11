package M2_Activity6;
/**
** This an abstract class with attributes
** - numberOfWheels
** - brand
** and methods
** - a concrete method destroy()
** - an abstract method startEngine()

*/
public abstract class Vehicle {

	private String brand;
	private Integer numberOfWheels;
	
	public Vehicle() {
		
	}

	
	abstract void startEngine();
	
	public void Destroy() {
		System.out.println(this.getNumberOfWheels() + " wheeled " + this.getBrand() + " is destroyed.");
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public Integer getNumberOfWheels() {
		return numberOfWheels;
	}


	public void setNumberOfWheels(Integer numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
}