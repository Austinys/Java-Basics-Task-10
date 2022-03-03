package lt.itacademy.java.basics;

public class Loops {
    public static void main(String[] args) {
    task7(365);
    task8(365);
    task9(5);
    }

    private static void task7(int daysPerYear) {
        int hoursInYear = 0;
        int minutesInYear = 0;
     for (int d = 0; d <= daysPerYear; d++) {
        hoursInYear = d * 24;
        minutesInYear = d * 24 * 60;
        }
        System.out.println("There are " + hoursInYear + " hours or " + minutesInYear + " minutes in one year.");
    }

    private static void task8(int daysPerYear) {
        int hoursInYear = 0;
        int minutesInYear = 0;
        int d = 0;
        while (d <= daysPerYear) {
            hoursInYear = d * 24;
            minutesInYear = d * 24 * 60;
            d++;
        }
        System.out.println("There are " + hoursInYear + " hours or " + minutesInYear + " minutes in one year.");
    }

    private static void task9(int number) {
            int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of number " + number + " is " + fact);
    }
}
