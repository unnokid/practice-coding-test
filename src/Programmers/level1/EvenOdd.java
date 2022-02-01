package Programmers.level1;

public class EvenOdd {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num;
        num = 3;
        System.out.println(solution.solution(num));
        num = 4;
        System.out.println(solution.solution(num));
    }
    static class Solution {
        public String solution(int num) {
            if(num %2 ==0){
                return "Even";
            }
            else
                return "Odd";
        }
    }
}
