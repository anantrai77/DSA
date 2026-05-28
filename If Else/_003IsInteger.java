
import java.util.Scanner;

public class _003IsInteger {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.print("Enter Number : ");
       double n = sc.nextDouble();
       int x = (int)n;
       if(n-x==0){
        System.out.println("Is an integer");
       }
       else{
        System.out.println("Is not an integer");
       }
    }
}
 