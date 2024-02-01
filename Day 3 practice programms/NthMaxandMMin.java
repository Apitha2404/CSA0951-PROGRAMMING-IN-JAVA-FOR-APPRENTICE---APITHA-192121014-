import java.util.*;
public class NthMaxandMMin {
    public static void main(String[] args){
        int array[] = {14,16,87,36,25,89,34};
                Arrays.sort(array);
        int M = 1;
        int N = 3;
        int MthMax = array[array.length - M];
        int NthMin = array[N-1];
        int sum = MthMax + NthMin;
        int difference = MthMax - NthMin;
        System.out.println("The maximum number is : " + MthMax);
        System.out.println("The Minimum number is :" + NthMin);
        System.out.println("The sum is : " + sum);
        System.out.println("The difference is : " + difference);


    }
}

