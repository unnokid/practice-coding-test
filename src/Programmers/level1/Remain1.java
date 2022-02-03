package Programmers.level1;

public class Remain1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=10;
        System.out.println(solution.solution(n));
        n=12;
        System.out.println(solution.solution(n));
    }
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            // 자연수 n, n을 x로 나눈 나머지가 1이 되도록하는
            //x가 가장 작은 자연수 return
            if(n%2 ==1){
                return 2;
            }
            else{
                for (int i = 3; i < n; i++) {
                    if(n%i == 1){
                        return i;
                    }
                }
            }
            return answer;
        }
    }
}
