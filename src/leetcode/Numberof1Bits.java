package leetcode;

public class Numberof1Bits {
    public static void main(String[] args) {

    }
    static public class Solution {
        public int hammingWeight(int n) {
            //자바에는 Integer.bitCount(n) 라는 함수가 있어서
            //n을 이진수로 변환해서 1의 개수를 셀수 있음
            return Integer.bitCount(n);
        }
    }
}
