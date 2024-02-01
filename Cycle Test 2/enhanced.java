import java.util.*;
public class enhanced  {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = new int[originalArray.length];
        int index = 0;
        for (int element : originalArray) {
            copiedArray[index++] = element;
        }
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}