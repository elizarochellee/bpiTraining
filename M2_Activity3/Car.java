package M2_Activity3;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int year;

    // no arg constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.color = "Unknown";
        this.year = 0;
    }

    // param constructor
    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // method - display car info
    public void displayInfo() {
        System.out.println("Car Info: " + brand + " " + model + ", Color: " + color + ", Year: " + year);
    }

    // setter
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setColor(String color) { this.color = color; }
    public void setYear(int year) { this.year = year; }
}

