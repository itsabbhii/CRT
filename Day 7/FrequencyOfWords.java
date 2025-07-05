import java.util.*;

public class FrequencyOfWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();


        String[] list = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for(String x: list){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : " + entry.getValue());
        }

    }    
}
