package day2;

import java.lang.invoke.SwitchPoint;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        LeapYear ly = new LeapYear();
        System.out.println(ly.isLeapYear(year));
        ly.whichMonth(8);
        ly.convertIfElse(5);

    }

    private boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    private void convertIfElse(int var) {
        switch (var) {
            case 1: {
                System.out.println("Good");
                break;
            }
            case 2: {
                System.out.println("Better");
                break;
            }
            case 3: {
                System.out.println("Best");
                break;
            }
            default: {
                System.out.println("Invalid");
            }
        }
    }

    private void whichMonth(int month) {
        switch (month) {
            case 1: {
                System.out.println("January");
                break;
            }
            case 2: {
                System.out.println("February");
                break;
            }
            case 3: {
                System.out.println("March");
                break;
            }
            case 4: {
                System.out.println("April");
                break;
            }
            case 5: {
                System.out.println("May");
                break;
            }
            case 6: {
                System.out.println("June");
                break;
            }
            case 7: {
                System.out.println("July");
                break;
            }
            case 8: {
                System.out.println("August");
                break;
            }
            case 9: {
                System.out.println("September");
                break;
            }
            case 10: {
                System.out.println("October");
                break;
            }
            case 11: {
                System.out.println("November");
                break;
            }
            case 12: {
                System.out.println("December");
                break;
            }
        }
    }
}