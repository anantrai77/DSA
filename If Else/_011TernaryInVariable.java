
import java.util.Scanner;

public class _011TernaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        int number = (n>=0) ? 100 : 0;
        System.out.println(number);
    }
}
