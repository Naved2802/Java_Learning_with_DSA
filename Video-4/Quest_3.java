import java.util.*;
public class Quest_3{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        
        
        for( int i = 1 ; i<11 ; i++){

            System.out.println(num*i);
        }
        
    }
}