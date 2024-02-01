import java.util.Scanner;
public class ReverseaWord {
    public static void main(String[] args)
    {
        System.out.println("enter the name");
        Scanner reverse = new Scanner(System.in);
        String name = reverse.nextLine();
        String empty = " ";
        int len = name.length();
        for(int i=len-1; i >=0; i--)
        {
            empty = empty+name.charAt(i);
        }
        System.out.print(empty);
    }
}