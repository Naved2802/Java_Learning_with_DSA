import java.util.Scanner;

public class Different {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        sc.nextLine();

        int numbers[] = new int[size];

        // input

        for (int i = 0; i < size; i++) {

            numbers[i] = sc.nextInt();
        }

        Boolean isAscending = true;

        for (int i = 0; i < size-1; i++) {

            if (numbers[i] > numbers[i+1]) {

                isAscending = false;

            }

        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {

            System.out.println("The array is not sorted in ascending order");
        }

    }

}