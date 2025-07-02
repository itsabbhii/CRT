import java.util.*;
public class FlipCaseInString {
    static String flipString(String str){
        String ans = "";
        for(char ch: str.toCharArray()){
            if(Character.isUpperCase(ch)) ans+=Character.toLowerCase(ch);
            else if(Character.isLowerCase(ch)) ans+=Character.toUpperCase(ch);
            else ans+=ch;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();
        
        System.out.println("Flipped String is: " + flipString(str));
    }
}
