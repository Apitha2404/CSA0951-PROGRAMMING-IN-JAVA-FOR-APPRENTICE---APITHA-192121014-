import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String reverse = "";
        int len = name.length();
        for(int i = len-1; i>= 0; i--){
            reverse = reverse+name.charAt(i);
        }
        if(name.equals(reverse)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
}
