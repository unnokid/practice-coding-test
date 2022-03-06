package leetcode;

public class CountAllValidPickupandDeliveryOptions {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=1;
        System.out.println(solution.countOrders(n));
        n=2;
        System.out.println(solution.countOrders(n));
        n=3;
        System.out.println(solution.countOrders(n));
        n=4;
        System.out.println(solution.countOrders(n));
        n=7;
        System.out.println(solution.countOrders(n));
    }
    static class Solution {
        public int countOrders(int n) {
            // n의 주문
            // 순차적으로 delivery(i) 이후 pickup(i)
            // delivery(i)가 항상 픽업(i) 이후가 되도록 모든 유효한 픽업/배달 가능한 시퀀스를 계산

            //배달이 먼저오고 그다음 픽업이 오는 경우의 수를 return

            //여러가지 경우의수를 살펴보고 예시랑 비교해본 결과
            // 2N!/2^N의 식의 성질을 띰
            //마지막 수를 10^9 + 7나머지 구하기

            long answer =1;
            int modulo =(int) Math.pow(10,9)+7;
            //2N! 구하기
            for (int i = 1; i <=2* n; i++) {
                answer *= i;

                //2^n 미리 나누기
                if(i%2==0){
                    answer/=2;
                }
                //숫자가 넘어가지않도록 미리미리 나누기연산
                answer%=modulo;
            }
            return (int) (answer);
        }
    }
}
