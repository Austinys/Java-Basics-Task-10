package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("MENU:");
        System.out.println("1. Perimeter and area of square");
        System.out.println("2. Perimeter and area of triangle");
        System.out.println("3. Perimeter and area of rectangle");
        System.out.println("Please enter any of the above option: ");

        int num = sc.nextInt();
        switch(num) {
           case 1:
               System.out.println("Please enter edge of square: ");
               double edge = sc.nextFloat();
               double areaSquare = edge * edge;
               double perimeterSquare = 4 * edge;
               System.out.println("Square perimeter is " + perimeterSquare + " and areas is " + areaSquare);
               break;

            case 2:
                System.out.println("Please enter edges, height and base of triangle: ");
                double height = sc.nextFloat();
                double base = sc.nextFloat();
                double triangleEdge1 = sc.nextFloat();
                double triangleEdge2 = sc.nextFloat();
                double triangleEdge3 = sc.nextFloat();
                double areaTriangle = (height * base) / 2;
                double perimeterTriangle = triangleEdge1 + triangleEdge2 + triangleEdge3;
                System.out.println("Triangle perimeter is " + perimeterTriangle + " and areas is " + areaTriangle);
                break;

            case 3:
                System.out.println("Please enter edges of rectangle: ");
                double rectangleEdge1 = sc.nextFloat();
                double rectangleEdge2 = sc.nextFloat();
                double areaRectangle = rectangleEdge1 * rectangleEdge2;
                double perimeterRectangle = (rectangleEdge1 * 2) + (rectangleEdge2 * 2);
                System.out.println("Rectangle perimeter is " + perimeterRectangle + " and areas is " + areaRectangle);
                break;
            default:
                System.out.println("Invalid operator!");

        }

      sc.close();
    }
}




