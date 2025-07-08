import java.util.*;

public class FindIndicesOfAnagrams {
    static List<Integer> findindex(String text, String pattern){
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> pMap = new HashMap<>();
        int k = pattern.length();

        for(char c: pattern.toCharArray()){
            pMap.put(c, pMap.getOrDefault(c, 0)+1);
        }

        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            sMap.put(c, sMap.getOrDefault(c, 0)+1);

            if(i >= k){
                char toRemove = text.charAt(i-k);
                sMap.put(toRemove, sMap.get(toRemove) - 1);
                if(sMap.get(toRemove) == 0) sMap.remove(toRemove);
            }

            if(sMap.equals(pMap)) result.add(i-k+1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.next();
        String pattern = input.next();

        List<Integer> result = findindex(text, pattern);

        System.out.println(result);
    }    
}
