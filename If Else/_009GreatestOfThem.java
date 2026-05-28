import java.util.Scanner;

public class _009GreatestOfThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is the greatest");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the greatest");
        }
        else if(c>a && c>b){
            System.out.println(c+" is greatest");
        }
        else{
            System.out.println("All are equal");
        }

        //Nested If else
            if(a>b && a>c){
                System.out.println(a);
            }
            else{ //ab b ya c me se hoga
                if(b>a && b>c){
                    System.out.println(b);
                }
                else{
                    System.out.println(c);
                }
            }
    }
}
