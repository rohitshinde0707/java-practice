package exercise_14_input_user;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number X :");
        x = in.nextInt();

        System.out.println("Enter Second Number Y :");
        y = in.nextInt();

        System.out.println("Before Swapping Numbers are:");
        System.out.println("x = " + x);
        System.out.println("y = "+ y);

        z = x;
        x = y;
        y = z;

        System.out.println("After Swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
