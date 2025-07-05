import java.util.*;

public class StringIsogramChecker {
    static boolean isIsogram(String word){
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : word.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch : map.keySet()){
            if(map.get(ch) != 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();

        String ans = isIsogram(word) ? word+" is an isogram" : word+" is not an isogram";
        System.out.println(ans);
    }
}
