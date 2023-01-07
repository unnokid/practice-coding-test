package leetcode;

public class GasStation {

    public static void main(String[] args) {

    }
    static class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int totalGas =0;
            int totalCost =0;

            for (int i = 0; i <gas.length; i++) {
                totalCost+=cost[i];
                totalGas+=gas[i];
            }

            //소모하는 가스량과 추가되는 가스량 비교
            if(totalGas < totalCost){
                return -1;
            }

            int cur =0;
            int start =0;

            for (int i = 0; i <gas.length ; i++) {
                cur = cur +(gas[i] - cost[i]);

                if(cur <0){
                    //시작 불가능 장소
                    start = i+1;
                    cur = 0;
                }
            }



            return start;
        }
    }
}
