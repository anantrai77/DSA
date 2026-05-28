
import java.util.Scanner;

public class _005AP {
    public static void main(String[] args) {
        //AP : 2,5,8,11...upto n terms
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        for(int i=2; i<=3*n-1; i=i+3){
            System.out.println(i);
        }

        int a = 2, d = 3;
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a+=d;
        }
    }
}
