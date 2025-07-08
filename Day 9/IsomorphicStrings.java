import java.util.*;
public class IsomorphicStrings {
    static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();

        for(int i = 0 ; i < s.length(); i++){ 
            char a = s.charAt(i), b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a) != b) return false;
            }
            else{
                map.put(a, b);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();
        String t = input.next();
        String ans = isIsomorphic(s, t) && isIsomorphic(t, s) ? "Yes" : "No";
        System.out.println(ans);
    }
}
