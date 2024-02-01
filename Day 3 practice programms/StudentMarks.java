import java.util.*;
public class StudentMarks {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enetr the marks in Python: ");
        int s1 = input.nextInt();
        System.out.print("enter the marks in c: ");
        int s2 = input.nextInt();
        System.out.print("Enetr the marks in physics: ");
        int s3 = input.nextInt();
        System.out.print("Enetr the marks in mathematics : ");
        int s4 = input.nextInt();
        int total = s1+s2+s3+s4;
        System.out.println("The total marks is :" + total);
        float agg = total/4f;
        System.out.println("the total aggregation is : "+ agg);
        if(agg>75){
            System.out.println("the grade is DISTINCTION");
        }
        else if(agg>=60 && agg<=75){
            System.out.println("The grade is FIRST DIVISION");
        }
        else if (agg>= 50 && agg<=60){
            System.out.println("The grade is SECOND DIVISION");
        }
        else if(agg>= 40 && agg<=50){
            System.out.println("The grade is THIRD DIVISON");
        }
        else{
            System.out.println("FAIL");
        }

    }
}
