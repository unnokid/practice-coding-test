package leetcode;

public class ReverseBits {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=Integer.parseInt( "00000010100101000001111010011100",2);
        System.out.println(solution.reverseBits(n));
    }
    static public class Solution {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            //2진 비트를 줄때 뒤집은 후 정수로 바꾸어서 return
            //비트를 먼저 뒤집기
            //비트를 반대로 만들때 and 연산

            int answer =0;
            for (int i = 0; i <32 ; i++) {
                //answer 늘리기
                answer <<=1;
                
                //한자리수 and연산
                answer+= n & 1;
                
                //n줄이기
                n >>=1;
            }
            return answer;

        }
    }
}
