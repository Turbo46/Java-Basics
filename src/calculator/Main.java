package calculator;

import fundamentals.Candy;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.sum(50, 50);
        System.out.println(result);

        int resCube = cal.cube(5);
        System.out.println(resCube);

        Calculator cal2 = new Calculator("Casio",1000,"Black");
        System.out.println(cal2.getName() + cal2.getPrice()+cal2.getColor());

        double sum = cal.simpleInterest(1,1,1);
        System.out.println(sum);
    }
}
