package leetcode;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String a;
        String b;
        a="11";
        b="1";
        System.out.println(solution.addBinary(a,b));
    }
    static class Solution {
        public String addBinary(String a, String b) {
            //이진법 더하기
            //문자열 길이가 매우 큼
            //따라서 기본적인 int로 범위가 표현이 안됨
            //BigInteger타입을 사용하면 범위가 훨씬 확장됨
            BigInteger A = new BigInteger(a,2);
            BigInteger B = new BigInteger(b,2);
            return A.add(B).toString(2);
        }
    }
}
