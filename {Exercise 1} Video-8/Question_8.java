import java.util.*;
public class Question_8 {

    public static void PowerCalculation(double x, int n){
        double  result =  Math.pow(x, n);

        System.out.println( x + " raised to the power " + n + " is : " + result);

        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base (x) : ");
        int x = sc.nextInt();

        System.out.println("Enter the value of exponent (n) : ");
        int n = sc.nextInt();

        PowerCalculation(x, n);

    }
    
}
