public class _008PassingArrayToMethods {
    public static void change(int[] y){
        y[2]=99;
    }
    public static void main(String[] args) {
        int [] x = {10,34,67,80,89};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
}
