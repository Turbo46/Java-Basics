package day2;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 1;
        System.out.println(isGreatestNumber(a,b,c));
    }
    public static int isGreatestNumber(int a,int b,int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        } else {
            System.out.println("No one Greatest");
            return 0;
        }
    }
}