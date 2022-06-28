package looping;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 2)
                    continue;
                else
                    System.out.println(i + " " + j);
            }
        }
//        Scanner val = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int value = val.nextInt();
//        int i = 1;
//        int result;
//        while (i <= 10) {
//            result = value * i;
//            System.out.println(value + "*" + i + " = " + result);
//            i++;
//
//        }
    }
}

//    public static void main(String args[]) {
//        //Take input from the user
//        //Create instance of the Scanner Class
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n=sc.nextInt();      //Declare and initialize the number
//        int i=1;
//        System.out.println("The multiplication table of "+n+" is: ");
//        //Infinite Loop Example
//        do
//        {
//            System.out.println(n+" * "+i+" = "+ (n*i));
//            i++;
//        }
//        while(i<=10);
//    }
//}
//        int i=0,sum=0;
//        while (i<=10){
//            System.out.println("Hello "+i);
//            sum+=i;
//            i++;
//        }
//        System.out.println(sum);
//        int n = 5;
//        printStars(n);
//        int i, sum = 0;
//        for (i = 0; i <= 10; ++i) {
//            sum = sum + i;
//        }
//        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter number:");
//        int num = sc.nextInt();
//        multiplication(num);

//    public static void printStars(int n)
//    {
//        int i, j;
//        for(i=0; i<n; i++)
//        {
//            for(j=0; j<=i; j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//    }
//    static void multiplication(int num) {
//        if (num > 0) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(num + " * " + i + " = " + num * i);
//            }
//        }
//
//    }