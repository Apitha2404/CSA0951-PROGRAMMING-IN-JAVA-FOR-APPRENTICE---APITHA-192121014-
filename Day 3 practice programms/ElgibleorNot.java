import java.util.Scanner;
public class ElgibleorNot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = input.nextInt();
        if(age>18){
            System.out.println("You are elgible for vote");
        }
        else if (age<0) {
            System.out.println("enter the correct age");
        }
        else {
            System.out.println("you are not elgible for vote");
        }
    }
}
