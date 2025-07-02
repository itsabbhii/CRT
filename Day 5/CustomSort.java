
import java.util.*;

public class CustomSort {
    public static void main(String[] args) {
        Integer[] numbers = {5, 3, 4, 1, 2};
        Arrays.sort(numbers, (a, b) -> a-b);
        // Arrays.sort(numbers, (a, b) -> Integer.compare(a, b));
        System.out.println("Sorted array: "+ Arrays.toString(numbers));

        String[] fruits = {"Apple", "Strawberry", "Avacado", "Mango", "Banana", "Orange"};
        // Arrays.sort(fruits, (a, b) -> Integer.compare(a.length(), b.length()));
        Arrays.sort(fruits, (a, b) -> b.compareTo(a));
        System.out.println("Sorted String array is: "+ Arrays.toString(fruits));

        Character[] chars = {'d', 'a', 'b', 'e', 'c'};
        Arrays.sort(chars, (a, b) -> a-b);
        // Arrays.sort(chars, (a, b) -> Character.compare(a, b));
        System.out.println("Sorted Character AArray is: "+Arrays.toString(chars));
        
    }    
}
