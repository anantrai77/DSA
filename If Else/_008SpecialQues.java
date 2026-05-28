
import java.util.Scanner;

public class _008SpecialQues {
    public static void main(String[] args) {
        /*
        Take positive integer input and print:
        riya if no. id divisible by 5
        banu if no. is divisible by 3
        apurva if no. is divisible by 5 & 3 both
        isha if no. is not divisible by 5 or 3
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        if(n%5==0 && n%3==0){
            System.out.println("Apurva");
        }
        else if(n%5!=0 && n%3!=0){
            System.out.println("Isha");
        }
        else if(n%5==0 && n%3!=0){
            System.out.println("Riya");
        }
        else{
            System.out.println("Banu");
        }
    }
}
