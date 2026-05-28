public class _010IncDec {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x++);//use then inc
        System.out.println(x);
        System.out.println(++x);//inc then use

        int y = 20;
        System.out.println(y--);
        System.out.println(y);
        System.out.println(--y);

        int a = 10;
        int b = a++;// b = 10 hua fir a 11 hua 
        System.out.println(a+" "+b);

        int c = 10;
        int d = ++c;
        System.out.println(c+" "+d);

    }
}
