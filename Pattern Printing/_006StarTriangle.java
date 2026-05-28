
import java.util.Scanner;

public class _006StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){//kitni lines hogi
            for(int j=1; j<=i; j++){//har line me kitna * hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
