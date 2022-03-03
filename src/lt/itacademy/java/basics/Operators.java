package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
  task5(10, 10, 10);
  task6(125, 10, 5, 1);
    }

    private static void task5(double a, double b, double c) {
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Triangle is invalid");
        } else if (a == b && a == c && b==c) {
            System.out.println("Triangle is Equilateral");
        } else if (a == b || a==c || b==c) {
            System.out.println("Triangle is Isosceles");
        } else if (a != b && a != c && b != c) {
            System.out.println("Triangle is Scalene");
        }

        System.out.println("a: " + a + " " + "b: " + b + " " + "c: " + c);
    }

    private static void task6(double distance, double fuelHas, double fuelUsage, double fuelPrice) {
       double distanceCanDrive = (fuelHas * 100) / fuelUsage;
       double fuelStillNeeds = ((distance * fuelUsage) / 100) - fuelHas;
       double fuelCost = fuelPrice * fuelStillNeeds;
       double fuelLeft = fuelHas - ((fuelUsage * distance) / 100);
        if (distanceCanDrive < distance) {
            System.out.println("Destination is in " + distance + " km. " +
          "Car is not able to reach the destination. It needs " +  fuelStillNeeds + " liter of fuel more. It will cost " + fuelCost);
        } else if (distanceCanDrive >= distance) {
            System.out.println("Destination is in " + distance + " km. Car is able to reach the destination. It will have " + fuelLeft + " liters of fuel left.");
        }

        System.out.println("distance: " + distance + ", " + "Fuel has: " + fuelHas + ", " + "Fuel usage: " + fuelUsage + " l/100km," + " Fuel price: " + fuelPrice + " e/l");





    }
}
