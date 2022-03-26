package leetcode;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String n;
        n="32";
        System.out.println(solution.minPartitions(n));
        n="82734";
        System.out.println(solution.minPartitions(n));
    }
    static class Solution {
        public int minPartitions(String n) {
            //문자열로 숫자를 줄때 이진법의 덧셈으로 몇개의 항을 써야 표현가능한지 return

            //한번에 1씩표현가능하기때문에 n중 숫자가 가장 큰수만큼 반복해야함
            int count =0;
            for (int i = 0; i <n.length() ; i++) {
                count = Math.max(n.charAt(i)-'0',count);
            }
            return count;
        }
    }
}
