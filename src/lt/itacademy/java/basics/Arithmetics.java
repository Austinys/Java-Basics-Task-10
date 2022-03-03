package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        task3();
        task4(2.4, 4);
    }

    private static void task3() {
        int a = 5;
        int volume = a * a * a;
        int perimeter = a * 12;
        System.out.println("Cube’s volume: " + volume);
        System.out.println("Cube’s perimeter: " + perimeter);
    }

    private static void task4(double feet, double inches) {
        double cm;
        cm = (feet * 12 * 2.54) + (inches * 2.54);

        System.out.println("2.4 feet and 4.0 inches = " + cm);


        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter feet: ");
        //String feet = scanner.nextLine();
        //System.out.println("Enter inches: ");
    }
}



// Hint: 1 inch = 2.54cm and 1 foot = 12 inches
//Input: 2.4 4
//Output: 2.4 feet and 4.0 inches = 5,083,312000 cm










