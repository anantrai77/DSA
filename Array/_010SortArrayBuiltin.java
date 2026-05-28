import java.util.Arrays;
public class _010SortArrayBuiltin {
    public static void print(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //sort:- ascending order
        int [] arr = {4,1,8,6,-3,-7,10,5};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
}
