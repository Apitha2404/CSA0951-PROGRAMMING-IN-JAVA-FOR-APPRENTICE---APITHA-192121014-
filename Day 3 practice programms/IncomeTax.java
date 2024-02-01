import java.util.*;
public class IncomeTax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the salary:");
        float income = input.nextFloat();
        if(income<=150000){
            System.out.println("NO TAX");
        }
        else if (income>=150001 && income<=300000){
            System.out.println("the tax is :" + income/10);
        }
        else if(income>=300001 && income<= 500000){
            System.out.println("the tax is : " + income/20);
        }
        else{
            System.out.println("The tax is : " + income/30);
        }

    }
}
