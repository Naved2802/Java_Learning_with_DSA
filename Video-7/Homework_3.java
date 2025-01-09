import java.util.Scanner;

public class Homework_3 {

    public static void printTable(int n) {

        // Loop

        for (int i = 1; i <= 10; i++) {

            int Table = n * i;

            System.out.println(n + " x " + i + " = " + Table);

        }

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        printTable(n);

    }

}
