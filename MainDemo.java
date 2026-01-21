// blueprint Design
class Calculator
{
    int a;
    public int add(int x , int y){
        int sum = x + y;
        return sum;
    }
}
public class MainDemo  {
        public static void main(String arg[])
        {
            int num1 = 4;
            int num2 = 5;
            // how we create the object
            // className -> variable -> new on -> constructor 
            Calculator calc = new Calculator();
            int result = calc.add(num1,num2);
            System.out.println(result);

        }
}

