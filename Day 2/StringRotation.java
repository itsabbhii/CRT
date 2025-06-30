import java.util.*;
public class StringRotation {
    boolean isRotated(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        else{
            int i = 0, j = 0;
            while(i<str1.length()){
                if(str1.charAt(i) == str2.charAt(j)) {
                    i++;
                    j = (j==str2.length()-1)? j+1 : 0;
                }
                else{
                    i = 0;
                    j = (j==str2.length()-1)? j+1 : 0;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = input.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = input.nextLine();
        

    }
}
