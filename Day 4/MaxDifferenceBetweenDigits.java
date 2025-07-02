import java.util.*;
public class MaxDifferenceBetweenDigits {
    static int maxDifference(int n){
        int min = 9, max = 0;
        while(n != 0){
            int digit = n % 10;
            max = (digit > max) ? digit : max;
            min = (digit < min) ? digit : min;
            n /= 10;
        }
        return max - min;
    }
    static int maxDifference(String str){
        int max = 0, min = 9;
        for(char ch : str.toCharArray()){
            int digit = ch - '0';
            max = (digit > max) ? digit : max;
            min = (digit < min) ? digit : min;
        }
        return max - min;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Max difference between digits is: "+ maxDifference(num));
        // System.out.println("Max difference of 9364 is: "+ maxDifference("9364"));
    }
    
}