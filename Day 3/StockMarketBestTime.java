public class StockMarketBestTime {

    static int usingTwoPointerApproach(int[] price){
        int right = 1, left = 0, maxProfit = 0;
        while(right < price.length){
            if(price[right] > price[left]){
                int profit = price[right]- price[left];
                maxProfit = Math.max(profit, profit);
            }else{
                left = right;
            }
            right++;
        }
        return maxProfit;
    }

    static int usingOneLoopOnly(int[] arr){
        int min = Integer.MAX_VALUE, maxProfit = 0 ;
        for(int price : arr){
            if( price < min){
                min = price;
            }
            else{
                int profit = price - min;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }

    static int maxProfitMultipleBuys(int[] arr){
        int maxProfit = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                maxProfit += arr[i+1] - arr[i];
            }
        }
        return maxProfit;
    }
        
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int min = arr[0], max = 0, min_index = 0; 

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                min_index = i;
            }
        }
        for(int i = min_index; i<arr.length; i++){
            max = arr[i] > max ? arr[i] : max;
        }
        System.out.println("Max Profit is: "+(max-min));
        System.out.println("Buy at: " + min + "\nSell at: " + max);
        System.out.println("Maximum Profit with multiple buys = " + maxProfitMultipleBuys(arr));
    }
}
