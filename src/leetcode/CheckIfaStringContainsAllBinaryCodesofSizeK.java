package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckIfaStringContainsAllBinaryCodesofSizeK {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        int k;
        s = "00110110";
        k = 2;
        System.out.println(solution.hasAllCodes(s, k));
        s = "00110";
        k = 2;
        System.out.println(solution.hasAllCodes(s, k));
        s = "0110";
        k = 2;
        System.out.println(solution.hasAllCodes(s, k));
    }

    static class Solution {
        public boolean hasAllCodes(String s, int k) {

            int result = (int) Math.pow(2, k);
            Set<String> set = new HashSet<>();

            for (int i = 0; i <= s.length() - k; i++) {

                String target = s.substring(i, i + k);
                System.out.println("뽑아온 target" + target);
                if(!set.contains(target)){
                    set.add(target);
                    result--;

                    if(result == 0){
                        return true;
                    }
                }
            }
            return false;
        }
    }

}
