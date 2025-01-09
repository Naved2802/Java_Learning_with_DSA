import java.util.Scanner;

public class Homework_1 {

    public static void printPrime(int num) {

        int count = 0;

        // Loop

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {

                count++;
            }
        }

            if (count == 2) {

                System.out.println("The given number is prime number");
            } else {

                System.out.println("The given number is not prime number ");
            }

            return;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number ");

        int num = sc.nextInt();

        printPrime(num);

    }

}
