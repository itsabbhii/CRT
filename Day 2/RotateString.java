import java.util.*;
public class RotateString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        String d = str+str;
        System.out.print("Enter no. of rotations: ");
        int n = input.nextInt();
        String ans = d.substring(n, (str.length()+n));
        System.out.println("Answer is : "+ans);
    }
}
