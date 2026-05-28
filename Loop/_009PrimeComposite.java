import java.util.Scanner;

public class _009PrimeComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        boolean x = true;
        // for(int i=2; i<=n-1; i++){
        for(int i=2; i<=Math.sqrt(n); i++){//This is better
            if(n%i==0){
                x = false;
                break;
            }
        }
        if(n==1)System.out.println("Neither prime nor Composite");
        else if(x==true)System.out.println("Prime Number");
        else System.out.println("Composite Number");
    }
}
