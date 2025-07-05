import java.util.*;
public class SubstringAnagram {
    static boolean isAnagram(String str1, String str2){
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
        String str = input.next();
        String pattern = input.next();
        int n = pattern.length();
        for(int i = 0 ; i < str.length()-pattern.length(); i++){
            String str1 = str.substring(i, (i+n));
            if(isAnagram(str1, pattern)){
                System.out.print(i+" ");
            }
        }
       
    }
}
