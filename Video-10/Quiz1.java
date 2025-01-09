import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();

        String names[] = new String[size];

        // input

        for (int i = 0; i < size; i++) {

            names[i] = sc.nextLine();
        }

        // output

        for (int i = 0; i < size; i++) {

            System.out.println(names[i]);
        }

    }

}
