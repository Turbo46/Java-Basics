package fundamentals;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(62);
        p1.setName("Samir");
        p1.setGender("Male");

        Person p2 = new Person();
        p1.setAge(60);
        p1.setName("Karim");
        p1.setGender("Male");

        Candy candy1 = new Candy();
        candy1.setPrice(100);
        candy1.setName("Samir");
        System.out.println(candy1.getName() +candy1.getPrice());

        }
}