
public class LargestSubarraySum {
    static int maxSubaaray(int[] arr){
        int n = arr.length;
        int maxSum = arr[0];
        int currentSum = arr[0];
        for(int i = 1; i < n ; i++){
            currentSum = Math.max(arr[i], currentSum+arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    static int maxSubarrayUsingDp(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];

        dp[0] = arr[0];
        int maxSum = arr[0];

        for(int i = 1 ; i < n ;i++){
            dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
            maxSum = Math.max(dp[i], maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubarrayUsingDp(arr));
    }
}
