import java.util.*;
public class MaximumLoot {
    static int maximumLoot(int[] bankLineup){
        int previousLoot = 0, currentLoot = 0;
        for(int cash: bankLineup){
            int newLoot = Math.max(cash + previousLoot, currentLoot);
            previousLoot = currentLoot;
            currentLoot = newLoot;
        }
        return currentLoot;
    }
    static int maximumLootUsingDp(int[] bankLineup){
        int n = bankLineup.length;
        if(n == 0) return 0;
        if(n == 1) return bankLineup[0];

        int[] dp = new int[n];

        dp[0] = bankLineup[0];
        dp[1] = Math.max(bankLineup[0], bankLineup[1]);

        for(int i = 2; i < n; i++){
            dp[i] = Math.max(bankLineup[i] + dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] bankLineup = {3, 1, 2, 5, 4, 2};
        int n = bankLineup.length;
        System.out.println("Maximum loot in sequence = "+maximumLoot(bankLineup));
        
        // to find maximum loot when first element is neighbour of last element 
        // we can calculate loot by including first element and including last element seperately and find maximum of those loots
        int maximum = Math.max(
            maximumLoot(Arrays.copyOfRange(bankLineup, 0, n-1)), 
            maximumLoot(Arrays.copyOfRange(bankLineup, 1, n))
        );
        System.out.println("Maximum amount is: "+maximum);
    }
}
