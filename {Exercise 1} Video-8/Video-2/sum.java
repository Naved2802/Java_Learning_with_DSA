import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number First: ");

        int a = sc.nextInt();

        System.out.println("Enter number Second: ");

        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(" The sum of a and b is :" + sum);

    }

}
