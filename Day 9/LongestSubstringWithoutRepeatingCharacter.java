import java.util.*;
public class LongestSubstringWithoutRepeatingCharacter {

	public static int findLongestSubstringLength(String str) {
		int l = 0 , r = 0, ans = 0;
        boolean[] isInWindow = new boolean[26];
        while(r < str.length()){

            while(isInWindow[str.charAt(r)-'a'] == true){
                isInWindow[str.charAt(l)-'a'] = false;
                l++;
            }

            isInWindow[str.charAt(r)-'a'] = true;

            ans = Math.max(ans, r-l+1);
            r++;
        }
        return ans;
	}
    static int findLongestSubstringLengthUsingIndices(String str){
        int l = 0, r = 0, ans = 0;
        int[] previousIndex = new int[26];
        Arrays.fill(previousIndex, -1);

        while(r < str.length()){
            l = Math.max(previousIndex[str.charAt(r)-'a']+1, l);
            previousIndex[str.charAt(r)-'a'] = r;
            ans = Math.max(ans, r-l+1);
            r++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();

        int ans = findLongestSubstringLengthUsingIndices(str);

        System.out.println("length of longest substring is:"+ans);
    }
}
