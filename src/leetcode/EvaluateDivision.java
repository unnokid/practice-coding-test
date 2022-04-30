package leetcode;

import java.util.*;

public class EvaluateDivision {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }

    static class Solution {
        static Map<String, Map<String, Double>> map;

        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
            //짝을 지어야함
            // a=2b , b= 3c 이러면 a=0.5b=3c
            double[] result = new double[queries.size()];
            map = new HashMap<>();

            //서로 관계 넣기
            for (int i = 0; i < equations.size(); i++) {
                String first = equations.get(i).get(0);
                String last = equations.get(i).get(1);

                //putIfAbsent()는 키에 대한 value가 null인경우 값을 넣어줌
                map.putIfAbsent(first, new HashMap<>());
                map.putIfAbsent(last, new HashMap<>());

                //서로 관계 조정
                map.get(first).put(last, values[i]);
                map.get(last).put(first, 1.0 / values[i]);
            }

            //계산 문제
            for (int i = 0; i < result.length; i++) {
                String first = queries.get(i).get(0);
                String last = queries.get(i).get(1);

                if (!map.containsKey(first) || !map.containsKey(last)) {
                    //map에 연관관계에 대한 부분이없으면 -1
                    result[i] = -1;
                } else if(first.equals(last)){
                    //자기자신 나누기
                    result[i] = 1;
                }else{
                    //나온 계산 모아두기
                    Set<String> history = new HashSet<>();
                    result[i] = dfs(history,first,last,1);
                }
            }

            return result;
        }

        double dfs(Set<String> history, String first, String last, double value){
            //first  == last 만드는게 목표
            history.add(first);
            if(first.equals(last)){
                return value;
            }
            //first 대한 key 값가져오기
            for (String target : map.get(first).keySet()) {
                if (history.contains(target)){
                    continue;
                }
                //연관있는값으로 다시 대조해보기
                double result = dfs(history,target,last,value * map.get(first).get(target));

                if(result != -1){
                    return result;
                }
            }

            return -1;
        }
    }
}
