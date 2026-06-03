public class _016RotateArray {
    public static void reverseArr(int []arr, int i, int j){
        while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        }
    } 
    public static void rotateArr(int [] arr, int d){
        int n = arr.length;
        d %= n;

        reverseArr(arr, 0, d-1);
        reverseArr(arr, d, n-1);
        reverseArr(arr, 0, n-1);

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        rotateArr(arr, 3);

        for(int ele : arr){
            System.out.print(ele+" "); 
        }
    }
}