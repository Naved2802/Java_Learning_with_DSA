import java.util.*;

public class Question_2 {

    public static void calcuteOddSum(int n) {

        int sum = 0;

        // Loop

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {

                sum = sum + i;

            }

        }

        System.out.println("The sum of odd numbers is: " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        calcuteOddSum(n);
    }

}
