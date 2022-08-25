package leetcode;

public class EliminationGame {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n= 6;
        System.out.println(solution.lastRemaining(n));
        n= 24;
        System.out.println(solution.lastRemaining(n));
        n= 30;
        System.out.println(solution.lastRemaining(n));
    }
    static class Solution {
        public int lastRemaining(int n) {
            //n의 정수를 줄때 1~n 이 나열되어지고
            //1. 처음엔 왼쪽에서부터 한칸씩 띄어져있는 숫자 제거
            //2. 이번엔 오른쪽에서 한칸씩 띄어져있는 숫자 제거

            //생각해보니 순서나열되고 1번 과정을 거친다는 의미는 홀수가 제거됨
            //따라서 정답은 무조건 짝수가 나옴(n=1 제외)

            return left(n);
        }
        static int left(int n){
            if(n<=2){
                return n;
            }
            return 2 * right(n/2);
        }
        static int right(int n){
            if(n<=2){
                return 1;
            }
            if(n%2==1){
                return 2*left(n/2);
            }
            return 2*left(n/2)-1;
        }
    }
}
