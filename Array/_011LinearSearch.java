public class _011LinearSearch {
    public static void main(String[] args) {
       int [] arr = {2,3,4,56,78,54,58,23,10};
       int target = 23;
       boolean flag = false;//false means target array me nahi h
       for(int i=0; i<arr.length; i++){
        if(arr[i] == target){
            flag = true;//true means target array me hai
            break;
        }
       }
       if(flag==true){
        System.out.println("Target is present ");
       }
       else{
        System.out.println("Target is missing");
       }

    }
}
