import java.util.*;

public class CandyDistribution {
    static int minimumcandy(int[] ratings){
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        for(int i = 1 ; i < n ; i++){
            if(ratings[i] > ratings[i-1]) candies[i] = candies[i-1]+1;
        }
        for(int i = n-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]) candies[i] = Math.max(candies[i], candies[i+1]+1);
        }
        int totalcandies = 0;
        for(int candy : candies) totalcandies+=candy;
        return totalcandies;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] rating = new int[n];
        for(int i = 0 ; i < n ; i++){
            rating[i] = input.nextInt();
        }
        System.out.println(minimumcandy(rating));
    }    
}
