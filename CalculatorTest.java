class Calculator{
    public int add(int a, int b)
    {
        return a + b;
    }
    public int add(int a, int b,int c)
    {
        return a + b + c;
    }
     public double add(double a, int b)
    {
        return a + b ;
    }
}
public class CalculatorTest {
    public static void main(String[] args){
        Calculator obj = new Calculator();
        int result = obj.add(8,9);
        double result1 = obj.add(9.8 , 2);
        System.out.println(result);
        System.out.println(result1);

    }
}
