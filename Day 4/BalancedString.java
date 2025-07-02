import java.util.*;

public class BalancedString {
    static boolean isBalanced(String str){
        int balance = 0;
        for(char ch : str.toCharArray()){
            if(ch == 'A' || ch == 'a') balance ++;
            else if(ch == 'B' || ch == 'b') balance --;
            else return false;
        }
        return balance == 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();

        String ans = isBalanced(str) ? "Yes" : "No";
        System.out.println("Answer is : " + ans);
    }
}
