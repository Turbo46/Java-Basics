package pet;

public class PetMaster extends Pet {
    public static void main(String args []){
        Pet pet1 = new Pet("Miku");
        Pet pet2 = new Pet("Niku");
        pet1.isSameName(pet2);

    Dog dog = new Dog();
    dog.eat();
    dog.sleep();
    dog.say("stardenburdenhardenbart");

    Fish fish = new Fish();
    fish.eat();
    fish.say("Blubub");
    System.out.println("I'm at: "+fish.dive(10)+"ft deep");
    System.out.println("I'm at: "+fish.dive(20)+"ft deep now");
    }
}
