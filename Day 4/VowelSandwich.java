import java.util.*;

public class VowelSandwich {
    static boolean isConsonant(char ch){
        return !"aeiouAEIOU".contains(ch+"");
    }
    static boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
    static boolean isVowelSandwich(String str){
        char[] arr = str.toCharArray();
        for(int i = 1 ; i < str.length()-1; i++){
            if(isConsonant(arr[i-1])  && (arr[i-1] == arr[i+1]) && isVowel(arr[i])) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = input.next();

        String ans = isVowelSandwich(str) ? "Yes" : "No";

        System.out.println("Answer is : " + ans);
    }    
}
