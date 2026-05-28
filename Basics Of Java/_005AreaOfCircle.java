import java.util.Scanner;

public class _005AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        double r = sc.nextDouble();
        double a = Math.PI*r*r;
        System.out.print("Area : ");
        System.out.println(a);
    }
}
