package leetcode;

public class NumberComplement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num;
        num=5;
        System.out.println(solution.findComplement(num));
        num=1;
        System.out.println(solution.findComplement(num));
        num=2;
        System.out.println(solution.findComplement(num));
    }
    static class Solution {
        public int findComplement(int num) {
            // 111111 에서 1인 부분만 빼면 원하는 return 값
            String temp = Integer.toBinaryString(num);
            //자리수 찾기
            //-1를 먼저빼고 int 변환해야 안터짐
            int answer = (int) (Math.pow(2,temp.length())-1);
            return answer - num;
        }
    }
}
