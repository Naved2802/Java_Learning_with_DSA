import java.util.*;

public class doubt {

    public static void printFactorial(int n) {

        int factorial = 1; 

        // Loop

        for( int i=n; i>=1; i--){

            factorial = factorial*i;
        }

        System.out.println(factorial);

        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        printFactorial(n);
    }

}