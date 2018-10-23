package java_algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {
    /**
     * 寻找一个字符串的最倡无重复子字符串
     * @param s
     * @return：最长无重复子字符串的长度
     */

    public int lengthOfLongestSubstring(String s){
        /**
         * 最直接方法，暴力破解，依次循环，找到该字符串的所有子字符串，记录下最长无重复的，返回
         */
        int n =s.length();
        int ans = 0;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j ++){
                if (allUnique(s, i, j)){
                    ans = Math.max(ans, j-i);
                }
            }
        }
        return ans;
    }

    public int lengthOfLongestSubstring1(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                ans = Math.max(ans, j - i);
            }else{
                set.remove(s.charAt(i));
                i++;
            }

        }
        return ans;
    }


    public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(j - i + 1, ans);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        /**
         *  返回一个字符串是否是无重复的。
         */
        HashSet set = new HashSet();
        for(int i = start; i<end; i++){
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        LongestSubstring a = new LongestSubstring();
        System.out.println(a.lengthOfLongestSubstring2("asdasdfsdf"));
    }
}
