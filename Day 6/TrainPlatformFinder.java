import java.util.*;

public class TrainPlatformFinder {
    static int findPlatforms(int[] arrival, int[] departure){
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i = 1 , j = 0;
        int n = arrival.length;
        int maxPlatforms = 1, neededPlatforms = 1;
        while(i < n && j < n){
            if(arrival[i] > departure[j]) {
                maxPlatforms--;
                j++;
            }else{
                maxPlatforms++;
                i++;
            }
            neededPlatforms = Math.max(maxPlatforms, neededPlatforms);
        }
        return neededPlatforms;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arrival = new int[n];
        int[] departure = new int[n];

        for(int i = 0; i < n; i++){
            arrival[i] = input.nextInt();
            departure[i] = input.nextInt() + arrival[i];
        }
        // int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        // int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(findPlatforms(arrival, departure));
    }
}
