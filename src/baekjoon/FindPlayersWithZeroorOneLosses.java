package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindPlayersWithZeroorOneLosses {

    public static void main(String[] args) {

    }
    static class Solution {
        public List<List<Integer>> findWinners(int[][] matches) {
            Set<Integer> exist = new HashSet<>();
            Map<Integer,Integer> loseCount = new HashMap<>();

            for(int[] match : matches){
                int win = match[0];
                int lose = match[1];
                exist.add(win);
                exist.add(lose);
                loseCount.put(lose, loseCount.getOrDefault(lose,0)+1);
            }


            List<List<Integer>> answer = Arrays.asList(new ArrayList<>(), new ArrayList<>());

            for(int target : exist){
                if(!loseCount.containsKey(target)){
                    answer.get(0).add(target);
                }else if(loseCount.get(target) == 1){
                    answer.get(1).add(target);
                }
            }

            Collections.sort(answer.get(0));
            Collections.sort(answer.get(1));

            return answer;
        }
    }
}
