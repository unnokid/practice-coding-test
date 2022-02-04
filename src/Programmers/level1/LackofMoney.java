package Programmers.level1;

public class LackofMoney {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int price;
        int money;
        int count;
        price = 3;
        money =20;
        count = 4;
        System.out.println(solution.solution(price,money,count));
    }
    static class Solution {
        public long solution(int price, int money, int count) {
            long total =0;

            //이용료 price, n번째 이용하면 이용료가 N배가 됨
            //놀이 기구를  count번 타게되면 금액이 모자라지는지 return
            for (int i = 1; i <= count ; i++) {
                total+=((long) price *i);
            }

            return money >= total ? 0 : total - money;
        }
    }
}
