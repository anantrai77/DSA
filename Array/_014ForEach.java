public class _014ForEach {
    public static void main(String[] args) {
        int [] arr = {5,8,2,6,9};

        for(int element : arr){//we cannot change the value of array by for each loop
            element *= 2;
        }
        for(int element : arr){
            System.out.print(element+" ");
        } 
    }
}
