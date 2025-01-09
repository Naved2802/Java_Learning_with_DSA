import java.util.*;

public class Question_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value of terms(n) : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;

        }

    }

}
