import java.util.*;
public class TitleCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String S = input.nextLine();

        String ans = "";
        int space = 1;
        for(int i = 0; i<S.length(); i++){
            if(S.charAt(i) == ' '){
                space = 1;
                ans = ans + S.charAt(i);
                continue;
            }
            if(space == 1 ){
                if ((int)S.charAt(i) > 90){
                    ans = ans + (char)((int)S.charAt(i) - 32);
                }else{
                    ans = ans + S.charAt(i);
                }
                space = 0;
            }else{
                if((int)S.charAt(i) < 91 && (int)S.charAt(i) > 64){
                    ans = ans + (char)((int)S.charAt(i)+32);
                }else{
                    ans = ans + S.charAt(i);
                }
            }
        }
        System.out.println("Title case is: "+ans);

    }
}