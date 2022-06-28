package vehicle;

import pet.Pet;

public class CarOwner {
    public static void main(String args []) {
        Car car1 = new Car();
        car1.start();
        car1.stop();
        car1.drive(10);
        SportCar sportCar1 = new SportCar();
        sportCar1.start();
        sportCar1.stop();
        sportCar1.drive(10);
    }
}
