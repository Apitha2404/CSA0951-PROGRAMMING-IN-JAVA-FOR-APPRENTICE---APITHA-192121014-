import java.util.Objects;
import java.util.Scanner;
public class Checktheusername {
    public static void main(String[] args)
    {
        Scanner word = new Scanner(System.in);
        System.out.println(("Enter the 1st user name"));
        String s1 = word.nextLine();
        System.out.println(("Enter the 2nd user name"));
        String s2 = word.nextLine();
        if(s1.equals(s2))
        {
            System.out.println(" the username is valid");
        }
        else
        {
            System.out.println("The username is invalid");
        }
    }
}
