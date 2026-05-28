import java.util.Scanner;

public class _007TraingleOrNot {
    public static void main(String[] args) {
        //take 3 positive integers input and tell they can the sides of triangle or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd side : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd side : ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Not valid Triangle");
        }
    }
}
