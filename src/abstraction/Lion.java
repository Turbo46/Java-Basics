package abstraction;

public class Lion extends Animal {
    @Override
    void walk(){
        System.out.println("The lion is walking");
    }
    void eat(){
        System.out.println("Lion is eating zebra");
    }
}
