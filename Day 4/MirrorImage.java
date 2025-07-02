
import java.util.Scanner;

public class MirrorImage {
    static String reverse(String str){
        String ans = "";
        int i = str.length()-1;
        while(i >= 0){
            ans+=str.charAt(i);
            i--;
        }
        return ans;
    }

    static String mirrorImage(String str){
        String[] words = str.split(" ");
        String ans = "";
        for(String s: words){
            ans += (reverse(s)+" ");
        }
        return ans.trim();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = input.nextLine();

        String mirror = mirrorImage(str);
        System.out.println("Mirror image is: "+mirror);
    }
}
