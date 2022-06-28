package looping;

public class LowerUpperCase {
    public static void main(String []args) {
        System.out.println("Checking for Uppercase character...");
        char character = 'y';
        System.out.println("Character: "+character);
        if (Character.isUpperCase(character)) {
            System.out.println("Character is in Uppercase!");
        }else {
            System.out.println("Character is in Lowercase!");
        }
    }
}
