
public class LargestAreaOfWater {
    public static void main(String[] args) {
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int left  = 0, right = arr.length-1, max_area = 0;
        while(left < right){
            int area = (right-left) * arr[left] < arr[right] ? arr[left] : arr[right];
            max_area = area>max_area ? area : max_area;
            if(arr[right] > arr[left]) left++;
            else right--;
        }        
        System.out.println("Max Area is : " + max_area);
    }
    
}