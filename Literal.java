public class Literal {
    public static void main(String a[]) {
        // literal
        // int number = 10_10_10_100;
        // int number = 0b101;
        int number = 0x7E;
        System.out.println(number);

        // double number1 = 55;
        double number1 = 10e10;
        System.out.println(number1);

        char c = 'a';
        c++;
        System.out.println(c);
        
        // Type Conversion - change data types to another automatically
        // Type Casting - force to change data types to another

        // Type Conversion
        byte b = 127;
        int d = 12 ;
        d = b; // that is worked because int has more bytes than byte
        System.out.println(d);

        // Type Casting
        float f = 5.6f;
        int x = (int)f;
        System.out.println(x);

        byte g = 127;
        int h = g;
        System.out.println(h);

        // Type Promotion  ( byte + byte -> can update to int)
        byte first = 10;
        byte second = 30;
        int result = first * second;
        System.out.println(result);


        // arithemetic operators
        int no1 = 2 ;
        int no2 = 4;          
        int resut = no1 * no2;
        ++no1;  // pre - increment
        no1++; // post - increment

        int resultUpdate = no1++; // fetch the value and then update
        // int resultUpdate = ++no1; // fetch the value and then update

        System.out.println(result);
        System.out.println(no1);
    }
}
