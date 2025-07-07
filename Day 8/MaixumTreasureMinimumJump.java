public class MaixumTreasureMinimumJump {
    static int maximumTreasure(int[] arr, int k) {
        int i = 0;
        int maxTreasure = arr[0];

        while (i < arr.length - 1) {
            int max = Integer.MIN_VALUE;
            int newIndex = -1;

            for (int j = i + 1; j <= Math.min(i + k, arr.length - 1); j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    newIndex = j;
                }
            }
            
            maxTreasure += arr[newIndex];
            i = newIndex;
        }

        return maxTreasure;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 9, 2, 4};
        int k = 3;
        System.out.println(maximumTreasure(arr, k));
    }
}
