package lt.itacademy.java.basics;

import java.util.Scanner;

public class Art {
    public static void main(String[] args) {
        Scanner tree = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter height of tree");
            int height = tree.nextInt();
            createTree(height);
            System.out.print("Do you want to continue (y/n)");
            choice = tree.nextLine();
        } while ((choice == "Y" || choice == "y"));
    }

    private static void createTree(int height) {

            for (int i = 0; i < height * 2; i += 2) {
                for (int spaces = (height * 2 - i) / 2; spaces >= 0; spaces--) {
                    System.out.print(" ");
                }
                for (int branches = 0; branches <= i; branches++) {
                    System.out.print("#");
                }
                System.out.println(" ");
            }
            for (int i = 0; i < height + 1; i++) {
                System.out.print(" ");
            }
           System.out.println("#");
        }
    }

