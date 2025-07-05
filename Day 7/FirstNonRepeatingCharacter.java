import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : word.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch : map.keySet()){
            if(map.get(ch) == 1){
                System.out.println(ch);
                break;
            }
        }
    }
}
