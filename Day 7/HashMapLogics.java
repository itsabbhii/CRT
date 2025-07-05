import java.util.*;

public class HashMapLogics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 3);
        map.put("Apple", 3);
        
        System.out.println(map.get("Apple"));
        System.out.println(map.containsKey("Mango"));

        for(Map.Entry<String ,Integer> entry : map.entrySet()){
            System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
        }

        System.out.println("Key value pairs are: ");
        for( String key: map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }
}
