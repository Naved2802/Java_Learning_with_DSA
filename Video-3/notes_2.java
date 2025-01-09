import java.util.*;

public class notes_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number first: ");
        int n1 = sc.nextInt();

        System.out.println("Enter number second: ");
        int n2 = sc.nextInt();

        System.out.println("1 : Addition(+)");
        System.out.println("2 : Subtraction(-)");
        System.out.println("3 : Multiply(*)");
        System.out.println("4 : Division(/)");
        System.out.println("5 : Modulus(%)");

        System.out.println("Choose an operator: ");
        int operator = sc.nextInt();

        switch (operator) {

            case 1:
                int result = n1 + n2;
                System.out.println(" The addition of " + n1 + " + " + n2 + " is : " + result);
                break;

            case 2:
                result = n1 - n2;
                System.out.println(" The subtraction of " + n1 + " - " + n2 + " is : " + result);
                break;

            case 3:
                result = n1 * n2;
                System.out.println(" The multiplication of " + n1 + " * " + n2 + " is : " + result);
                break;

            case 4:

                if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println(" The division of " + n1 + " / " + n2 + " is : " + result);
                } else {
                    System.out.println("Division by zero is not allowed ");
                }
                break;

            case 5:
                result = n1 % n2;
                System.out.println(" The modulud of " + n1 + " % " + n2 + " is : " + result);
                break;

            default:

                System.out.println("Invalid operator selected");

        }

    }

}
