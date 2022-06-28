package interfacetest;

import java.util.Scanner;

public class Circle implements Shape{

    @Override
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        int r = sc.nextInt();
        double areaOfCircle =Math.PI *r *r;
        System.out.println(areaOfCircle);

    }


    @Override
    public void perimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        int r = sc.nextInt();
        double perimeterOfCircle = 2*Math.PI*r;
        System.out.println(perimeterOfCircle);

    }
}