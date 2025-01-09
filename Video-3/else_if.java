import java.util.*;

public class else_if {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter  number first : ");
        int a = sc.nextInt();

        System.out.println(" Enter  number second : ");
        int b = sc.nextInt();

        if (a == b) {

            System.out.println("Both are Equal");

        }

        else if (a > b) {

                System.out.println(" a is greater than b");

            } 
            
         else {

                System.out.println("a is lesser");

            }

        }

    }

