package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionInformation {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String today;
        String[] terms;
        String[] privacies;
        today = "2022.05.19";
        terms = new String[]{"A 6","B 12", "C 3"};
        privacies = new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(solution.solution(today, terms, privacies)));
    }
    static class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {
            List<Integer> result = new ArrayList<>();
            Map<String, Integer> map = new HashMap<>();

            String[] split = today.split("\\.");
            int year = Integer.parseInt(split[0]);
            int month = Integer.parseInt(split[1]);
            int day = Integer.parseInt(split[2]);
            for (int i = 0; i < terms.length ; i++) {
                String[] s = terms[i].split(" ");
                map.put(s[0], Integer.valueOf(s[1]));
            }

            for (int i = 0; i < privacies.length ; i++) {
                String[] s = privacies[i].split(" ");
                String[] daily = s[0].split("\\.");
                int y = Integer.parseInt(daily[0]);
                int m = Integer.parseInt(daily[1]);
                int d = Integer.parseInt(daily[2]);
                int limit = map.get(s[1]);

                if(m+limit > 12) {
                    y += (m + limit) / 12;
                    m = (m + limit) % 12;
                }else{
                    m+=limit;
                }

                //13이상인 12배수가 나오면 m이 0이 될 가능성이 있음
                if(d ==0){
                    d =28;
                    m--;
                }
                if(m ==0){
                    m =12;
                    y--;
                }

                if(year > y){
                    result.add(i+1);
                }else if(year == y){
                    if(month > m){
                        result.add(i+1);
                    }else if(month == m){
                        if(day >= d){
                            result.add(i+1);
                        }
                    }
                }
            }

            return result.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
