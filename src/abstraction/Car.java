package abstraction;

public abstract class Car {
    double price;
    String color;

    abstract void start();

    void displayNumberOfTyres(){
        System.out.println(" Car has 4 tyres");
    }


}