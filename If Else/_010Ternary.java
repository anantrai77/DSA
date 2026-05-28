import java.util.Scanner;

public class _010Ternary {
    public static void main(String[] args) {
        //odd or even
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        // condition ? sach : jhoot
        System.out.println((n%2 == 0) ? "Even" : "Odd");
    }
}
