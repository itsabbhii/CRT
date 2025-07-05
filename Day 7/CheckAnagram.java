import java.util.*;

public class CheckAnagram {
    static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : str1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char ch: str2.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)-1);
        }
        for(int i: map.values()){
            if(i != 0 ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        String ans = isAnagram(str1, str2) ? str1+" and "+str2+" are anagrams" :str1+" and "+str2+" are not anagrams";
        System.out.println(ans); 
    }
}
