class Car {
    // Attributes (Fields)
    String brand;
    int speed;

    // Constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method
    void display() {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}


public class Classes {
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car("Toyota", 120);
        Car car2 = new Car("BMW", 200);

        // Calling method
        car1.display();
        car2.display();
    }
}
