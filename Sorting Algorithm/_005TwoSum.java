import java.util.Arrays;
public class _005TwoSum {
    public static void TwoSum(int []arr, int target){
        Arrays.sort(arr);
        int i=0 , j= arr.length-1;
        boolean found = false;
        while(i<j){
            if(arr[i]+arr[j]==target){
                found = true;
                break;
            }
            else if(arr[i]+arr[j]>target) j--;
            else if(arr[i]+arr[j]<target) i++;
        }
        if(found==true) System.out.println(arr[i]+" "+arr[j] );
        else System.out.println("sum not found");
    }
    public static void main(String[] args) {
        int [] arr = {2,4,1,5,6,7,8,4,5,6,10,0};
        TwoSum(arr, 9);
    }
}
