class Computer
{
    public void playMusic()
    {
        System.out.println("Music is playing");

    }
    public String getMeAPen(int cost)
    {
        if(cost >= 100)
            return "Here is a pen" ;
        // else
        return "Nothing";
    }
}
public class MethodTest {

    public static void main(String[] args)
    {
      Computer comObj1 = new Computer();
      comObj1.playMusic();
      String pen = comObj1.getMeAPen(10);
      System.out.println(pen);

    }
}
