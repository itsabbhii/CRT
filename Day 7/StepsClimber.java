
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

    static BigInteger fibonacciUsingDp(int n){
        if(n <= 1) return BigInteger.ONE;
        BigInteger[] dp = new BigInteger[n+1];
        dp[0] = BigInteger.ONE;
        dp[1] = BigInteger.ONE;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1].add(dp[i-2]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of stairs: ");
        int num = input.nextInt(); 

        System.out.println("Number of ways = "+fibonacciUsingDp(num));
    }
}
