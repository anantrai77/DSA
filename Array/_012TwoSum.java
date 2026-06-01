public class _012TwoSum {
    public static void main(String[] args) {
        int arr[] = {-2, 3, 11, 15};
        int target = 9;

        System.out.println(twoSum(arr, target));
    }

    public static boolean twoSum(int arr[], int target){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
