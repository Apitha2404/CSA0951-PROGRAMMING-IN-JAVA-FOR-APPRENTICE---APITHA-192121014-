import java.util.*;
public class Denomination {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the 1st Denomination:");
       int d1 = input.nextInt();
       System.out.println("Enter the no.of denomination notes:");
       int n1 = input.nextInt();
        System.out.println("Enter the 2nd Denomination:");
        int d2 = input.nextInt();
        System.out.println("Enter the no.of denomination notes:");
        int n2 = input.nextInt();
        System.out.println("Enter the 3rd Denomination:");
        int d3 = input.nextInt();
        System.out.println("Enter the no.of denomination notes:");
        int n3 = input.nextInt();
        System.out.println("Enter the 4rth Denomination:");
        int d4 = input.nextInt();
        System.out.println("Enter the no.of denomination notes:");
        int n4 = input.nextInt();
        int Total = (d1*n1)+(d2*n2)+(d3*n3)+(d4*n4);
        System.out.println("The total amount available in ATM is :"+ Total );


    }
}