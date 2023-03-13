package Programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class RoughlyBoard {

    public static void main(String[] args) {

    }
    static class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];

            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < keymap.length ; i++) {
                String s = keymap[i];
                for (int j = 0; j <s.length() ; j++) {
                    map.put(s.charAt(j),Math.min(map.getOrDefault(s.charAt(j),1000), j+1));
                }
            }

            for (int i = 0; i <targets.length ; i++) {
                String s = targets[i];
                int sum =0;
                for (int j = 0; j <s.length() ; j++) {
                    if(!map.containsKey(s.charAt(j))){
                        sum =-1;
                        break;
                    }
                    sum += map.get(s.charAt(j));
                }
                answer[i] = sum;
            }

            return answer;
        }
    }
}
