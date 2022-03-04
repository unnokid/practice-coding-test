package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TeemoAttacking {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] time;
        int duration;
        time = new int[]{1,4};
        duration = 2;
        System.out.println(solution.findPoisonedDuration(time,duration));
        time = new int[]{1,2};
        duration = 2;
        System.out.println(solution.findPoisonedDuration(time,duration));
    }
    static class Solution {
        public int findPoisonedDuration(int[] timeSeries, int duration) {
            //티모가 애쉬를 공격하는데
            //공격하는 time배열과 독의 지속시간을 줌
            //총 독에 걸려있는 시간을 return
            int total =0;
            for (int i = 0; i <timeSeries.length-1 ; i++) {
                if(timeSeries[i+1] - timeSeries[i] >= duration){
                    total+=duration;
                }else{
                    total+=timeSeries[i+1] - timeSeries[i];
                }
            }

            return total+duration;
        }
    }
}
