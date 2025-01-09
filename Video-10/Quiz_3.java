import java.util.Scanner;

public class Quiz_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp;

        int size = sc.nextInt();

        sc.nextLine();

        int numbers[] = new int[size];

        // input

        for (int i = 0; i < size; i++) {

            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (numbers[i] > numbers[j]) {

                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }

    }

}