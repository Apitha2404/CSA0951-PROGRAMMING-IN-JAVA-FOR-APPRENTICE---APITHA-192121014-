import java.util.*;
public class BonustoEmployees {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary");
        double salary = input.nextDouble();
        System.out.println("Enter the grade");
        String grade = input.next();
        double bonus = 0.0;
        if(grade.equalsIgnoreCase("A")){
            bonus = salary*0.05;
        }
        else if(grade.equalsIgnoreCase("B")){
            bonus = salary*0.10;
        }
        if(salary<=10000){
            bonus += salary * 0.02;
        }
        double totalsalary = bonus+salary;
        System.out.println("the bonus is :" + bonus);
        System.out.println(" The total salary is : " + totalsalary);

    }
}
