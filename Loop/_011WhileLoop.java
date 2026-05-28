public class _011WhileLoop {
     public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        int j=1;

        //do while: first run then check the condition
        do { 
            System.out.print(j+" ");
            j++;
        } while (j<=10);

        //Infinite loop
        // int x=0;
        // while(x<10){
        //     System.out.println("Good Morning");
        // }
     }
}
