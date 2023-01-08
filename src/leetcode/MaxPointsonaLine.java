package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsonaLine {

    public static void main(String[] args) {

    }
    static class Solution {
        public int maxPoints(int[][] points) {
            int result =0;

            for (int[] nextX : points){

                Map<Double,Integer> map = new HashMap<>();
                for (int[] nextY : points){
                    if(nextX == nextY){
                        continue;
                    }

                    double temp = 0;
                    if(nextX[0] == nextY[0]){
                        //기울기가 무한임
                        temp = Double.MAX_VALUE;
                    }else{
                        temp = (nextY[1] - nextX[1]) /(double) (nextY[0] - nextX[0]);
                    }

                    map.put(temp , map.getOrDefault(temp,0)+1);

                    if(map.get(temp) > result){
                        result = map.get(temp);
                    }
                }
            }

            return result+1;
        }
    }
}
