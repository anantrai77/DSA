public class _001ArrayBasics {
    public static void main(String[] args) {
        int [] x={6,7,8,10,135,56};
        //indexing
        System.out.println(x[4]);//access
        //updating elements -> mutability
        x[3] = 67;
        System.out.println(x[3]);

        int[] arr = new int [4];//4 size ka array | 0 to 3
        arr[0]=10;
        arr[1]=11;
        arr[2]=43;
        arr[3]=23;
    }
}
