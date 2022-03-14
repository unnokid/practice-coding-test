package leetcode;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringinanArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr;
        int k;
        arr = new String[]{"d","b","c","b","c","a"};
        k = 2;
        System.out.println(solution.kthDistinct(arr,k));
        arr = new String[]{"aaa","aa","a"};
        k = 1;
        System.out.println(solution.kthDistinct(arr,k));
    }
    static class Solution {
        public String kthDistinct(String[] arr, int k) {
            //k번째로 나오는 유일한 문자열를 return

            Map<String,Integer> map = new HashMap<>();
            int count =1;
            String answer ="";
            for (int i = 0; i < arr.length; i++) {
                if(map.containsKey(arr[i])){
                    map.put(arr[i],2);
                }else{
                    map.put(arr[i],1);
                }
            }

            for(int i = 0; i < arr.length; i++) {
                if(map.get(arr[i]) == 1) {
                    k--;
                }

                if(k == 0) {
                    return arr[i];
                }
            }
            return "";
        }
    }
}
