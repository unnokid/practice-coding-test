package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RingsandRods {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="B0B6G0R6R0R6G9";
        System.out.println(solution.countPoints(s));
        s="B0R0G0R9R0B0G0";
        System.out.println(solution.countPoints(s));
    }
    static class Solution {
        public int countPoints(String rings) {
            //n개의 링
            //빨강,녹색,파랑
            //링은 0~9까지의 막대에 존재
            //String으로 각 막대와 링의 색에 대한 정보 부여
            //막대에 색깔 모두가 걸려있는 막대의 개수를 return


            int[] r = new int[10];
            int[] b = new int[10];
            int[] g = new int[10];
            int answer =0;
            for (int i = 0; i < rings.length(); i=i+2) {

                int target = rings.charAt(i+1)-'0';
                char color = rings.charAt(i);
                if(color =='R'){
                    r[target]++;
                }else if(color == 'B'){
                    b[target]++;
                }else if(color =='G'){
                    g[target]++;
                }
            }

            for (int i = 0; i <10 ; i++) {
                if(r[i] >0 && g[i] >0 && b[i] >0){
                    answer++;
                }
            }

            return answer;

        }
    }
}
