import java.util.Scanner;
public class skippingnumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enetr the starting number(m):");
        int m=input.nextInt();
        System.out.println("Enter the ending number (k) :");
        int n=input.nextInt();
        System.out.println("enter the number difference between m and n (k):");
        int k=input.nextInt();
        for(int i=m;i<=n;i=i+k+1)
        {
            System.out.print(i+" ,"); }

    }
}
