package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumRoundstoCompleteAllTasks {

    public static void main(String[] args) {

    }
    static class Solution {
        public int minimumRounds(int[] tasks) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int task : tasks){
                if(!map.containsKey(task)){
                    map.put(task, 1);
                }
                else{
                    map.put(task, map.get(task)+1);
                }
            }
            int count = 0;
            for(Map.Entry entry : map.entrySet()){
                int val = (int) entry.getValue();
                if(val == 1){
                    return -1;
                }
                if(val >= 3){
                    count += val / 3;
                    if(val % 3 != 0){
                        count += 1;
                    }
                }else if(val == 2){
                    count += 1;
                }
            }
            return count;
        }
    }


}
