import java.util.Scanner;

public class Homework_2 {

    public static void printEvenOdd(int n) {

        if (n % 2 == 0) {

            System.out.println("The given number is even number");

        } else {

            System.out.println("The given number is odd number");
        }

        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        printEvenOdd(n);

    }

}
