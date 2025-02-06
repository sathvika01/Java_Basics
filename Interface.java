interface Vehicle {
    void start(); // Abstract method

    // Default method (introduced in Java 8)
    default void stop() {
        System.out.println("Vehicle is stopping...");
    }

    // Static method (introduced in Java 8)
    static void service() {
        System.out.println("Vehicle service is required.");
    }
}

// Implementing the interface
class Cars implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Vehicle car = new Cars();
        car.start();
        car.stop(); // Calls default method

        Vehicle.service(); // Calls static method
    }
}

// Default methods allow adding new functionality to interfaces without breaking existing implementations.
//✅ Static methods belong to the interface itself and are not inherited by implementing classes.


