import java.util.Scanner;

public class _005ArrayMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size : ");
        int n= sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Array Element : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int mul = 1;
        for(int i=0; i<n; i++){
            mul *=arr[i];
        }
        System.out.println(mul);
    }
}
