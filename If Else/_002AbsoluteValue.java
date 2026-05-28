
import java.util.Scanner;

public class _002AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int x = sc.nextInt();
        if(x<0){
            x = -x;
        }
        System.out.println(x);
    }
}
