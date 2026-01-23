public class ArrayTest {
    public static void main (String a[])
    {
        // Static Array
        int nums[] = { 2, 4, 6, 8};
        // replace the value
        nums[1] = 3;

        // array index starts from zero
        System.out.println(nums[1]);
        // System.out.println(nums[]);

        // Dynamic Array
        int numbers[] = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;

        System.out.println(numbers[2]);

        // if you want to fetch all the values 
        for( int i = 0; i <= 3 ; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
