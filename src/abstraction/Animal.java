package abstraction;

public abstract class Animal {
    String name;
    int noOfLegs;
    String colour;

    abstract void walk();
    abstract void eat();
    void sleeping(){
        System.out.println("The animal still sleeping");
    }
}
