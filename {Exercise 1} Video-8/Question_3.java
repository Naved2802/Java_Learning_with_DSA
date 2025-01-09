import java.util.*;

public class Question_3 {

    public static void calculateGreaterone(double n1, double n2) {

        double largest = n1;

        if (n2 > largest) {

            largest = n2;
        }

        System.out.println("The greatest number from the given numbers is : " + largest);

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number first: ");
        double n1 = sc.nextDouble();

        System.out.println("Enter number second: ");
        double n2 = sc.nextDouble();

        calculateGreaterone(n1, n2);

    }

}
