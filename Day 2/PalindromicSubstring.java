import java.util.*;
public class PalindromicSubstring {
    static boolean isPalindrome(String st){
        int l = 0, h = st.length()-1;
        while(l < h){
            if(st.charAt(l) != st.charAt(h)) return false;
            l++;
            h--;
        }
        return true;
    }
    static boolean isSingleChar(String st){
        if(st.length()<=1) return true;
        for(int i = 1; i<st.length()-1; i++){
            if(st.charAt(i) != st.charAt(0)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String st = input.nextLine();
        String ans;
        if(isPalindrome(st)){
            if(isSingleChar(st)) ans = "doesn't exist";
            else ans = st.substring(0, st.length()-1);
        }else{
            ans = st;
        }
        System.out.println("Longest non Palindromic Substring is: "+ans);
    }
    
}