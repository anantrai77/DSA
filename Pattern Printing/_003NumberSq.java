
import java.util.Scanner;

public class _003NumberSq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1; i<=row; i++){//kitni lines hogi
            for(int j=1; j<=row; j++){//har line me kitna * hoga
                System.out.print(j);
            }
            System.out.println();
        } 
    }
}
