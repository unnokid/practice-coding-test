package Programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] clothes;
        clothes = new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution.solution(clothes));
        clothes = new String[][]{{"crowmask", "face"},{"bluesunglasses", "face"},{"smoky_makeup", "face"}};
        System.out.println(solution.solution(clothes));
    }
    static class Solution {
        public int solution(String[][] clothes) {
            int answer = clothes.length;

            Map<String, Integer> map = new HashMap<>();

            //옷으로 위장함
            //옷의 종류를 주고 서로 다른 옷의 조합의 수를 return

            //옷을 키값으로 주고 동일한 경우 계속사용해야됨
            for (int i = 0; i < clothes.length; i++) {
                map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
            }

            //map의 개수
            if(map.size()>1){
                int count =1;
                for(String key : map.keySet()){
                    count *= (map.get(key) +1);
                }

                answer = count -1;
            }


            return answer;
        }
    }
}
