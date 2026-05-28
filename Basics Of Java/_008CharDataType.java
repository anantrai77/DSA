public class _008CharDataType {
    public static void main(String args[]){
            //TypeCasting: ek data type se doosra data conversion
    char ch = 'Z';
    int x = ch; //Implicit typecating
    System.out.println(x);

    char om = 'z';
    int y = (int)om;//Explicit typecasting
    System.out.println(y);

    char chr = 'c';
    System.out.println(chr+0);
    
    //integer to character
    int l = 32;
    char cr = (char)l;
    System.out.println(cr);
    }
}
