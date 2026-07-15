public class _001BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-50,-4,1,4,6,8,10,23,45,67,87,89,100};
        int target = 10;
        int low=0, high=arr.length-1, mid;
        boolean found = false;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
            else{
                found=true;
                break;
            }
        }
        if(found==true) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}
