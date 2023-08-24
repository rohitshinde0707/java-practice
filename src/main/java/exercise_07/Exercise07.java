package exercise_07;
import java.util.Scanner;
public class Exercise07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number:");

        int number = input.nextInt();
        int multi;

        for (int i = 1; i<=10; i++){
            multi = number*i;
            System.out.println(multi);
        }
    }
}
