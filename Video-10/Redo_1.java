import java.util.*;

public class Redo_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = { 99, 90, 0, 300 };

        int x = sc.nextInt();

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] == x) {

                System.out.println(" x found at index: " + i);
            }
        }

    }

}
