import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canFormPalindrome(String s) {
        Map<Character, Integer> frq = new HashMap<>();
        for (char c : s.toCharArray()) {
            frq.put(c, frq.getOrDefault(c, 0) + 1);
        }
        int odd = 0;
        for (int count : frq.values()) {
            if (count % 2 != 0) {
                odd++;
            }
        }
        return odd <= 1;
    }
}
