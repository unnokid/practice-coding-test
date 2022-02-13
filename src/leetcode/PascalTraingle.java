package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTraingle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int numRows;
        numRows = 5;
    }
    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            
            for(int i=0; i<numRows; i++) {
                List<Integer> list = new ArrayList<>();
                
                for(int j=0; j<=i; j++) {
                    //처음과 끝을 1로 채우기
                    if(j == 0 || j == i) {
                        list.add(1);
                    } else {
                        //사이값 채우기
                        int prev = result.get(i-1).get(j-1);
                        int next = result.get(i-1).get(j);
                        list.add(prev+next);
                    }
                }
                result.add(list);
            }
            return result;
        }
    }
}
