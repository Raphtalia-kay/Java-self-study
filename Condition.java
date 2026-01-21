public class Condition {
    public static void main(String arg[]){
        int x = 1;
        // java is not depend on indentation
        if (x < 10 && x < 10)
        {
            System.out.println(x);
            System.out.println("Hello");
        }else
            System.out.println("World");

        //ternary operator
        int a = 12;
        int b = 14;
        int c = a > b ? a : b;
        System.out.println(c);

        //switch syntax ( old version of switch)
        String today = "Monday";
        switch(today){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Today is not a weekday");
        }
      
        //switch syntax ( new version of switch) 
        // use arrow , don't need to use break
        switch(today)
        {
            case "Sunday", "Saturday" -> System.out.println("weekend");
            case "Monday" -> System.out.println("Sad Day");
            default -> System.out.println("Hello default");
        }

        //storing data to variable
        String message = "";
         switch(today)
        {
            case "Sunday", "Saturday" -> message = "weekend";
            case "Monday" -> message = "Message Day";
            default -> message = "Hello default";

        }
        System.out.println(message);

        // update 
        message = switch(today)
        {
            case "Sunday", "Saturday" -> "weekend";
            case "Monday" -> "Return Day";
            default -> "Hello default";

        };
        System.out.println(message);

        // yield
        message = switch(today)
        {
            case "Sunday", "Saturday" : yield "weekend";
            case "Monday" : yield "Yield Day";
            default : yield "Hello default";

        };
        System.out.println(message);
        
    }
}
