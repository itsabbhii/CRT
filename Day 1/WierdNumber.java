import java.util.*;
public class WierdNumber {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(n%2!=0 || (n<=20 && n>=6)){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
        sc.close();
    }
}
