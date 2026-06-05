
import java.util.ArrayList;
import java.util.Collections;

public class _020ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(21);
        arr.add(7);
        arr.add(10);
        arr.add(23);
        arr.add(6);

        System.out.println(arr.get(2));

        arr.set(2,19);
        System.out.println(arr.get(2));

        System.out.println(arr);

        int n = arr.size();
        for(int i=0; i<n; i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();
        
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //21 7 19 23 6
        arr.add(9); // 21 7 19 23 6 9 
        arr.add(2, 27);//21 7 27 19 23 6
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        arr.remove(6);
        System.out.println();
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);


    }
}
