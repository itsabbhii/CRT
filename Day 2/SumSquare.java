import java.util.*;
public class SumSquare {
        static int sumSquare(int n){
        int l = Integer.toString(n).length();
        int s1 = n/(int)Math.pow(10, l/2), s2 = n%(int)Math.pow(10, (l/2));
        int sum = s1+s2;
        return sum*sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        String ans = (sumSquare(n) == n) ? "Successful": "Not Successful";
        System.out.println("Answer is: "+ans);
    }
}
