package leetcode;

public class FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] operation;
        operation = new String[]{"--X","X++","X++"};
        System.out.println(solution.finalValueAfterOperations(operation));
        operation = new String[]{"++X","++X","X++"};
        System.out.println(solution.finalValueAfterOperations(operation));
        operation = new String[]{"X++","++X","--X","X--"};
        System.out.println(solution.finalValueAfterOperations(operation));
    }
    static class Solution {
        public int finalValueAfterOperations(String[] operations) {
            //++X X++ --X X-- 이걸로 0부터 결과값을 return

            int answer =0;

            for (int i = 0; i <operations.length ; i++) {
                char[] temp = operations[i].toCharArray();
                answer+= temp[1] == '+' ? 1: -1;
            }
            return answer;
        }
    }
}
