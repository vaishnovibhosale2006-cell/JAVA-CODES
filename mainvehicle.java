class Vehicle {
    int baseSpeed = 60;

    int getMaxSpeed() {
        return baseSpeed;
    }
}

class Car extends Vehicle {
    int getMaxSpeed() {
        return 120;
    }
}

class Bike extends Vehicle {
    int getaxSpeed() {
        return 180;
    }
}

public class mainvehicle {
    public static void main(String[] args) {
        Vehicle v;
        
        v = new Vehicle();
        System.out.println("Vehicle Max Speed: " + v.getMaxSpeed());

        v = new Car();
        System.out.println("Car Max Speed: " + v.getMaxSpeed());

        v = new Bike();
        System.out.println("Bike Max Speed: " + v.getMaxSpeed());
    }
}
