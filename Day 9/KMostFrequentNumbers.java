import java.util.*;

public class KMostFrequentNumbers {
    static List<Integer> findKMostFrequent(int[] numbers, int k){
        List<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int number:numbers){
            map.put(number, map.getOrDefault(number, 0)+1);
        }

        for(int key: map.keySet()){
            ArrayList<Integer> arr2 = new ArrayList<>();
            arr2.add(key);
            arr2.add(map.get(key));
            arr.add(arr2);
        }
        for(int i = 0; i < k; i++){
            result.add(arr.get(i).get(0));
        }
        
        return result;

    }
    static List<Integer> findUsingPriorityQueue(int[] numbers, int k){
        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for(int number : numbers){
            map.put(number, map.getOrDefault(number, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            heap.add(entry);
            if(heap.size() > k){
                heap.poll();
            }
        }

        while(!heap.isEmpty()){
            result.add(heap.poll().getKey());
        }

        Collections.reverse(result);

        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] numbers = new int[n];
        for(int i = 0 ; i < n; i++){
            numbers[i] = input.nextInt();
        }

        int k = input.nextInt();

        for(int number: findKMostFrequent(numbers, k)) System.out.print(number+" ");
    }    
}
