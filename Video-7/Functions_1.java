import java.util.*;

public class Functions_1 {

    public static int calculateSum(int a, int b) {

        return a + b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number first: ");
        int a = sc.nextInt();
        System.out.println("Enter number second: ");

        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("The output is : "  + sum);

    }

}
