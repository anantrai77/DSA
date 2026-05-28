public class _015ReverseArray{
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8};
        int i=0;
        int n = arr.length;
        int j= n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
