import java.util.Scanner;

public class leapyearornot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();
        if(year%4==0){
            System.out.println("the year is leap year");
        }
        else{
            System.out.println("The year is not leap year");
        }
    }
}
