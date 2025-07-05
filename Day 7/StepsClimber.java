
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class StepsClimber {

    static HashMap<Integer, BigInteger> map = new HashMap<>();

    static BigInteger fibonacci(int n) {
        if (map.containsKey(n)) 
            return map.get(n); 
        else if (n == 1 || n == 0)
            return BigInteger.valueOf(1);
        else
            map.put(n, fibonacci(n - 1).add(fibonacci(n - 2)));
        return map.get(n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of stairs: ");
        int num = input.nextInt(); 

        System.out.println("Number of ways = "+fibonacci(num));
    }
}
