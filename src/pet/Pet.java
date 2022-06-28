package pet;

public class Pet {

    private int age;
    private int height;
    private int weight;
    private String color;
    private String name;

    public Pet() {

    }

    public Pet(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("Good Night");
    }

    public void eat() {
        System.out.println("Eating food");
    }

    public void say(String word) {
        System.out.println(word);
    }

    public boolean isSameName(Pet pet) {
        if (this.getName() == pet.getName()) {
            System.out.println("Both pet are same name");
            return true;
        }System.out.println("This pet are different");
        return false;
    }


}
