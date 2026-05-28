import java.util.Scanner;

public class _002OutputInput {
    public static void main(String[] args) {
        int [] arr = {2,43,51,12,34,26};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //default values
        int [] x = new int[7];
        for(int i=0; i<arr.length; i++){
            System.out.print(x[i]+" ");
        }

        System.out.println();
        
        //input
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<7; i++){
            x[i]=sc.nextInt();
        }
        System.out.println();

        //print
        for(int i=0; i<7; i++){
            System.out.print(2*x[i]+" ");//printing double 
        }

    }
}
