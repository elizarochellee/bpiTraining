package M2_Activity3;


public class M2_Activity3 {
    public static void main(String[] args) {
        // no-arg constructor
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setModel("Corolla");
        car1.setColor("White");
        car1.setYear(2022);
        car1.displayInfo();

        // parameterized constructor
        Car car2 = new Car("Honda", "Civic", "Black", 2023);
        car2.displayInfo();
    }
}
