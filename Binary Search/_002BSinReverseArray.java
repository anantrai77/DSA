public class _002BSinReverseArray {
    public static void main(String[] args) {
        int [] arr = {100,99,90,87,76,56,54,53,45,43,32,21,14,1,0};
        int target =2;
        int low=0, high=arr.length;
        boolean found =false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target) high=mid-1;
            else if(arr[mid]>target) low=mid+1;
            else{
               found=true;
               break; 
            }
        }
        if(found==true) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}
