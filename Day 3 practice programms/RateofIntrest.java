import java.util.Scanner;
public class RateofIntrest {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the price");
        int price = input.nextInt();
        System.out.println("enter the no.of years");
        int noofyears = input.nextInt();
        System.out.println("if you are srcitizen print y else print n");
        char srcitizen = input.next().charAt(0);
        double intrest = 0.0;
        if(srcitizen=='y'){
            intrest = (price*noofyears*12)/100;
            System.out.println(intrest);
        }
        else{
            intrest = (price*noofyears*10)/100;
            System.out.println(intrest);

        }


    }
}
