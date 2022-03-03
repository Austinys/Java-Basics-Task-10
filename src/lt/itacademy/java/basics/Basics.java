package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
       // task1();
        task2();
    }

    private static void task1() {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String surname = sc.nextLine();
        String age = sc.nextLine();


        System.out.println("Hello, I am " + name + " " + surname + ". I am attending IT Academy 2022");
        System.out.println("age: " + age);
    }

    private static void task2() {


        byte shoeSize = 39;
        short age = 15;
        int length = 890;
        float weight = 80.69f;
        char clothesSize = 'S';
        boolean married = true;

        String s = " "+ shoeSize + age + length + weight + clothesSize + married;
        System.out.println("s: " + s);

    }




}

