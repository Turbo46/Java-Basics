package abstraction;

public class TestMain {
    public static void main(String args[]){
        Audi audi = new Audi();
        audi.start();
        BMW bmw = new BMW();
        bmw.start();

        Dog dog = new Dog();
        dog.walk();
        Lion lion = new Lion();
        lion.walk();
    }
}