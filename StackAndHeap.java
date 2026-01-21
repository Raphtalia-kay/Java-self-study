class Calculator{
    int num = 5;
    public int add(int x , int y)
    {
        System.out.println("This one is local variable -> " + num);
        return x + y;
    }
}
public class StackAndHeap {
    public static void main(String[] args){
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        int result1 = obj.add(1,2);
        int result2 = obj1.add(3,4);

        obj1.num = 10;
        int numR1 = obj.num;
        int numR2 = obj1.num;
        System.out.println("First Object number is  -> " + numR1);
        System.out.println("Second Object number is-> " + numR2);

        System.out.println("This one is result of adding two numbers -> " + result1);
        System.out.println("This one is result of adding two numbers -> " + result2);
    }
}
