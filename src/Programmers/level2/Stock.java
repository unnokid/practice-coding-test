package Programmers.level2;

public class Stock {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices;
        prices = new int[]{1,2,3,2,3};
        System.out.println(solution.solution(prices));
    }
    static class Solution {
        public int[] solution(int[] prices) {
            int[] answer = {};

            //초 단위로 기록된 주식가격 prices
            //가격이 떨어지지 않은 기간은 몇초인지 return
            
            //초가 지나가면서 인덱스위치보다 값이 더 크면 더해줌

            answer = new int[prices.length];
            for (int i = 0; i < prices.length-1; i++) {
                for (int j = i+1; j < prices.length; j++) {
                    answer[i]++;
                    if(prices[i]>prices[j]){
                        break;
                    }

                }
            }


            return answer;
        }
    }
}
