    import java.util.*;

    public class Question_9 {

        public static void calculateGCD(int a, int b) {

            while (b != 0) {

                int remainder = a % b;
                a = b;
                b = remainder;

            }

            int result = a;

            System.out.println(" The GCD of numbers a and b is: " +  result);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number first: ");
            int n1 = sc.nextInt();

            System.out.println("Enter the number second: ");
            int n2 = sc.nextInt();

            calculateGCD(n1, n2);
        }

    }
