import java.util.Scanner;

public class _016aPowerb {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();//a to the power b

        int power = 1;
        for(int i=1; i<=b; i++){
            power*=a;
        }
        System.out.println(power);


    }
}
