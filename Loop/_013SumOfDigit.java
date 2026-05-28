import java.util.Scanner;

public class _013SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int digit =0;
        while(n!=0){
            digit= digit+n%10;
            n/=10;
        }
        System.out.println((digit>0) ? digit : -digit);
    }
}