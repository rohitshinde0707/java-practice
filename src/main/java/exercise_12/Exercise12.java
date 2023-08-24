package exercise_12;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int num1 = input.nextInt();

        System.out.println("Enter Second Number:");
        int num2 = input.nextInt();

        System.out.println("Enter Third Number:");
        int num3 = input.nextInt();

        System.out.println("Enter Fourth Number:");
        int num4 = input.nextInt();

        System.out.println("Enter Fifth Number:");
        int num5 = input.nextInt();

        double  avg = ((num1 + num2 + num3 + num4 + num5)/5);

        System.out.println("Average Of the Number's is = "+avg);

    }
}
