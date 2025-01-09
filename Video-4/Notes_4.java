import java.util.*;

public class Notes_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int n = sc.nextInt();

        // prime number are those number which are only divisible by itself or one

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                count++;
            }
            }

            if (count == 2) {

                System.out.println(" The given number " + n + "  is prime number");

            } else {
                System.out.println(" The given number" + n + " is not prime number ");
            }
        }

    }


