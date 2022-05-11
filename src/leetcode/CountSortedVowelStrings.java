package leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountSortedVowelStrings {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=1;
        System.out.println(solution.countVowelStrings(n));
        n=2;
        System.out.println(solution.countVowelStrings(n));
        n=3;
        System.out.println(solution.countVowelStrings(n));
    }
    static class Solution {
        public int countVowelStrings(int n) {
            //뭔가 규칙이 있음
            // n = 1 => 5(1+1+1+1+1), n =2 => 15(5+4+3+2+1)
            // n = 3 => 35(15+10+6+3+1), n= 4 => 70(35+20+10+4+1)
            int a =1;
            int e =1;
            int i =1;
            int o =1;
            int u =1;

            for (int j = 1; j < n; j++) {
                o+=u;
                i+=o;
                e+=i;
                a+=e;
            }
            return a+e+i+o+u;
        }
    }
}
