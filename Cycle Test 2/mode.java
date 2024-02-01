import java.util.*;
public class mode {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 2, 5, 4, 2};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.print("Mode(s): ");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}