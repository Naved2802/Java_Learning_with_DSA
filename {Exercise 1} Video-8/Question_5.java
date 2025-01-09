import java.util.*;

public class Question_5 {

    public static void checkEligibility(int age) {

        if (age > 18) {

            System.out.println("You are adult and you can vote ");

        }

        else if (age == 18) {

            System.out.println("Welcome for the first time vote you are adult and you can vote");
        }

        else {

            System.out.println("You are not an adult and you can't vote , go and sleep");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        checkEligibility(age);

    }

}
