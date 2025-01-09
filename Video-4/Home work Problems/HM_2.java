import java.util.*;
public class HM_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, marks;
    
        do{

          System.out.println("Enter any number: ");
             input = sc.nextInt();

            if( input == 1){

                System.out.println("Enter the marks : ");


             marks = sc.nextInt();

             if(marks>=90){

                System.out.println(" This is good ");
             }

             else if(marks>=60){

                System.out.println(" This is also good ");
             }

             else if(marks>=0){

                System.out.println(" This is  good as well");
             }
             else {

                System.out.println(" Invalid marks! Please enter marks between 0 and 100. ");
            }


            } 
            
        }while (input!=0);

            System.out.println("Stop!! Thank You!! ");

        
        
    }
   
}

