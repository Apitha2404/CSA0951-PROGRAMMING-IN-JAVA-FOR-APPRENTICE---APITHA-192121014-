import java.util.*;
public class DecimaltobinaryOctal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int decimal = input.nextInt();
        String Binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        System.out.println(" the Binary number is :" + Binary);
        System.out.println("The octal number is :" + octal);

    }
}
