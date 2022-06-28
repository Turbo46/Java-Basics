package interfacetest;

import java.util.Scanner;

public class Rectangle implements Shape{

    @Override
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        double areaOfRectangle = l*b;
        System.out.println(areaOfRectangle);
    }

    @Override
    public void perimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        double perimeterOfRectangle = (l*b)*2;
        System.out.println(perimeterOfRectangle);
    }
}