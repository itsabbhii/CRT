import java.util.*;

public class PalindromicAsciiWeightChecker {
    static boolean isPalindrome(String str){
        int i = 0, j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    static int sumOfAscii(String str){
        int sum = 0;
        for(int i = 0 ; i<str.length(); i++){
            sum += str.charAt(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        int ans = isPalindrome(str) ? sumOfAscii(str) : -1;
        System.out.println("Palindrome ASCII Sum: "+ans);
    }
}
