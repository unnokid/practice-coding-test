package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberofOccurrences {

    public static void main(String[] args) {

    }
    static class Solution {
        public boolean uniqueOccurrences(int[] arr) {

            Map<Integer,Integer> map = new HashMap<>();
            Set<Integer> number = new HashSet<>();

            for (int i = 0; i <arr.length ; i++) {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }

            for(int key :map.keySet()){
                int target = map.get(key);

                if(number.contains(target)){
                    return false;
                }else{
                    number.add(target);
                }
            }
            return true;
        }
    }
}
