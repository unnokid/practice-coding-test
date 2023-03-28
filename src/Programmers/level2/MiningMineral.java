package Programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiningMineral {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] picks;
        String[] minerals;

        picks = new int[]{1,3,2};
        minerals = new String[]{"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"};
        System.out.println(solution.solution(picks,minerals));

    }
    static class Solution {
        public int solution(int[] picks, String[] minerals) {
            int answer = 0;
            //광물 캐기

            int total =picks[0] +picks[1]+picks[2];
            List<int[]> list = new ArrayList<>();

            for (int i = 0; i <minerals.length ; i+=5) {
                if(total ==0){
                    break;
                }

                int sum =0;
                int dia =0;
                int iron=0;
                int stone =0;

                total--;
                for (int j = i; j <i+5 ; j++) {
                    if(j == minerals.length){
                        break;
                    }

                    String target = minerals[j];

                    if(target.equals("diamond")){
                        sum+=25;
                        dia++;
                    }else if(target.equals("iron")){
                        sum+=5;
                        iron++;
                    }else{
                        sum+=1;
                        stone++;
                    }
                }
                list.add(new int[]{dia,iron,stone,sum});
            }
            //피로도가 가장 높은 순서대로 정렬
            Collections.sort(list, (a,b)-> (b[3]-a[3]));

            int cur =-1;

            for (int i = 0; i <list.size() ; i++) {
                int dia =list.get(i)[0];
                int iron = list.get(i)[1];
                int stone = list.get(i)[2];

                //각 피로도가 높은 순서대로 곡갱이 소모
                if(picks[0] >0){
                    answer+= dia+iron+stone;
                    picks[0]--;
                }else if(picks[1] >0){
                    answer+= (dia*5)+iron+stone;
                    picks[1]--;
                }else if(picks[2] >0){
                    answer+= (dia*25)+(iron*5)+stone;
                    picks[2]--;
                }else{
                    //곡갱이 없음
                    break;
                }
            }

            return answer;
        }
    }
}
