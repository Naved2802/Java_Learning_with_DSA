import java.util.*;

public class notes_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 : January ");
        System.out.println("2 : February  ");
        System.out.println("3 : March ");
        System.out.println("4 :  April ");
        System.out.println("5 : May ");
        System.out.println("7 : June ");
        System.out.println("8 : July ");
        System.out.println("9 : September ");
        System.out.println("10 : October ");
        System.out.println(" 11 : November ");
        System.out.println(" 12 : December ");

        System.out.println("Choose a month : ");
        int month = sc.nextInt();

        switch (month) {

            case 1:
                System.out.println(" January");
                break;

            case 2:
                System.out.println(" February");
                break;

            case 3:
                System.out.println(" March ");
                break;

            case 4:
                System.out.println(" April ");
                break;

            case 5:
                System.out.println(" May ");
                break;

            case 6:
                System.out.println(" June ");
                break;

            case 7:
                System.out.println(" July ");
                break;

            case 8:
                System.out.println(" August ");
                break;

            case 9:
                System.out.println(" September ");
                break;

            case 10:
                System.out.println(" October ");
                break;

            case 11:
                System.out.println(" November ");
                break;

            case 12:
                System.out.println(" December ");
                break;

            default:

                System.out.println("Invalid month selected");

        }

    }

}
