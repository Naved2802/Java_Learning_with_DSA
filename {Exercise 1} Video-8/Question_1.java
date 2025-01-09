import java.util.*;

public class Question_1 {

    public static void printAverage(int a, int b, int c) {

        double Total = a + b + c;

        System.out.println("The sum of given numbers is : " + Total);

        System.out.println("The Average of the given number is : " + Total / 3);

        return;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number first : ");
        int num_1 = sc.nextInt();

        System.out.println("Enter number second : ");
        int num_2 = sc.nextInt();

        System.out.println("Enter number third : ");
        int num_3 = sc.nextInt();

        printAverage(num_1, num_2, num_3);

    }

}