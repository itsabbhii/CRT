import java.util.*;
public class GroupAnagrams {
    static List<List<String>> groupAnagrams(String[] words){
        Map<String, List<String>> map = new HashMap<>();
        
        for(String word: words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!map.containsKey(key)) map.put(key, new ArrayList<>());

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    static List<List<String>> groupAnagramsWithoutSorting(String[] words){
        Map<String, List<String>> map = new HashMap<>();

        for(String word: words){
            int[] arr = new int[26];
            for(char c: word.toCharArray()){
                arr[c-'a']++;
            }

            String key = "";

            for(int num: arr){
                key = key+num+"#";
            }

            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] words = new String[n]; 
        for(int i = 0 ; i < n; i++){
            words[i] = input.next();
        }

        List<List<String>> groups = groupAnagramsWithoutSorting(words);
        for(List<String> group: groups) System.out.println(group);

    }
}
