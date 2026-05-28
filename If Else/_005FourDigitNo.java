
import java.util.Scanner;

public class _005FourDigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. : ");
        int n = sc.nextInt();
         if(n>999 && n<10000){
            System.out.println("4 Digit Number");
         }
         else System.out.println("Not 4 digit number");
    }
}
