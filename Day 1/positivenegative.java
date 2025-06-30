import java.util.*;
public class positivenegative
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a Number");
        n = sc.nextInt();

        if(n>0){
            System.out.println("Positive Number");
        }
        else if(n == 0){
            System.out.println("Zero Number");
        }
        else{
            System.out.println("Negative Number");
        }
        sc.close();
    }
}