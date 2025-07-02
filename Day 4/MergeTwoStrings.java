import java.util.*;

public class MergeTwoStrings {
    static String mergeString(String str1, String str2){
        String ans = "";
        int i = 0, j = 0;
        int max_length = (str1.length()>str2.length()) ? str1.length() : str2.length();
        while(i < max_length){
            if(i < str1.length()) ans += str1.charAt(i);
            if(j < str2.length()) ans += str2.charAt(j);
            i++;
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = input.next();

        System.out.print("Enter String 2: ");
        String str2 = input.next();

        String mergedString = mergeString(str1, str2);
        System.out.println("Merged string is : "+mergedString);
    }
}

