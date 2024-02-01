import java.util.Scanner;
public class AddPattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int i,j,s;
        int n = input.nextInt();
        for(i = 1 ; i<=n;i++){
            int a = 1;
            for (s = 1; s<= n-i; s++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print(a+ " ");
                a=a*(i-j)/j;
            }
            System.out.println();
        }

    }

}
