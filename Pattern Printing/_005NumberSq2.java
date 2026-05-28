
import java.util.Scanner;

public class _005NumberSq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){//kitni lines hogi
            for(int j=1; j<=n; j++){//har line me kitna * hoga
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
