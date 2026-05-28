
import java.util.Scanner;

public class _004Arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n=sc.nextInt();
        int [] a= new int[n];
        System.out.print("Enter Element : ");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            sum += a[i];
        }
        System.out.println(sum);
    }
}
