public class FoldingArraySum {
    static int[] foldedSum(int[] arr){
        int[] newArr = new int[((arr.length+1)/2)];
        int left= 0, right = arr.length-1;
        while(left <= right){
            newArr[left] = left==right ? arr[left] : arr[left]+arr[right];
            left++;
            right--;
        }
        return newArr; 
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 8};
        int ans[] = foldedSum(arr);
        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}
