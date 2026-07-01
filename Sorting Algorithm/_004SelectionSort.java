public class _004SelectionSort {
    public static void Ssort(int [] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[mindex];
            arr[mindex]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,5,4,6,-3,7,5,0,8,9,12};
        Ssort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
