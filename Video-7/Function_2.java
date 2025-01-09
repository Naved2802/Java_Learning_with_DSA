import java.util.Scanner;

public class Function_2 {

    public static int calcualateProduct(int a, int b) {

        return a * b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number first: ");
        int a = sc.nextInt();
        System.out.println("Enter number second: ");

        int b = sc.nextInt();

        System.out.println("The Product of 2 numbers  is : " + calcualateProduct(a, b));

    }
 
}
