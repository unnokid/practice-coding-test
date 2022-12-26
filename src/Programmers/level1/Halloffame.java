package Programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Halloffame {

    public static void main(String[] args) {

    }
    static class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i <score.length ; i++) {
                list.add(score[i]);
                Collections.sort(list);
                if(list.size() <k){
                    answer[i] = list.get(0);
                }else{
                    answer[i] = list.get(i-k+1);
                }

            }

            return answer;
        }
    }
}
