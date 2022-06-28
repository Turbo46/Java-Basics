package day3;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String input = sc.nextLine();
        String s1 = input.replaceAll("[aiueoAIUEO]", "");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
    }
}