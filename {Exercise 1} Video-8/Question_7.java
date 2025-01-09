import java.util.*;

public class Question_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        String userchoice;

        do {
            System.out.println("Enter a number: ");
            int num = sc.nextInt(); // Number input
            sc.nextLine(); // Consume the newline character

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.println("Do you want to continue and enter another number (type 'Stop' to stop): ");
            userchoice = sc.nextLine(); // Get the user's choice to continue

        } while (!userchoice.equalsIgnoreCase("Stop")); // Stop when user types "Stop"

        System.out.println("Positive numbers entered: " + positiveCount);
        System.out.println("Negative numbers entered: " + negativeCount);
        System.out.println("Zero numbers entered: " + zeroCount);

        sc.close(); // Close the scanner
    }
}
