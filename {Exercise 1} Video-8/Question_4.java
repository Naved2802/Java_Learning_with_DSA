import java.util.*;

public class Question_4 {

    public static double calculateCircumference(int rad) {

        double pi = 3.14;

        return 2 * pi * rad;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of Circle : ");
        int rad = sc.nextInt();

        double Circum =calculateCircumference(rad);

        System.out.println("Circumference of circle is : " + Circum );



    }

}
