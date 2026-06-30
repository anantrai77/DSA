public class _002BubbleSort {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {4,3,6,1,7,2,9,7,10,-5};
        int n = arr.length;
        print(arr);

        // for(int i=0; i<n-1; i++){
        //     for(int j=0; j<n-1-i; j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }
        // print(arr);

        //bubble sort optimised
        
        for(int i=0; i<n-1; i++){
            boolean isSorted = true;
            for(int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    isSorted=false;
                    break;
                }
            }
            if(isSorted==true) break;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print(arr);


    }
}
