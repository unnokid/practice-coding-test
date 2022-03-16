package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="abccccdd";
        System.out.println(solution.longestPalindrome(s));
        s="a";
        System.out.println(solution.longestPalindrome(s));
        s="bb";
        System.out.println(solution.longestPalindrome(s));
        s="civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(solution.longestPalindrome(s));
    }
    static class Solution {
        public int longestPalindrome(String s) {
            //주어진 문자열들로 양쪽이 대칭인 문자열을 만들 때
            //가장 길게 만들 수 있는 길이 return

            int answer =0;
            boolean odd = false;
            Map<Character, Integer> map = new HashMap<>();

            for(char c : s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            for(Integer t : map.values()){
                if(t%2==0){
                    answer+=t;
                }else{
                    answer+=t-1;
                    odd= true;
                }
            }
            if(odd){
                answer++;
            }

            return answer;

        }
    }
}
