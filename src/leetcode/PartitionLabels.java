package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="ababcbacadefegdehijhklij";
        System.out.println(solution.partitionLabels(s));
        s="eccbbbbdec";
        System.out.println(solution.partitionLabels(s));

    }
    static class Solution {
        public List<Integer> partitionLabels(String s) {
            //문자열이 주어질때
            //각 문자가 한파트에만 사용되게 최대 부분으로 나눠서 길이 return

            List<Integer> answer = new ArrayList<>();

            //알파벳 마지막으로 나오는 위치를 표시해두기
            int[] map = new int[26];
            for (int i = 0; i <s.length() ; i++) {
                map[s.charAt(i)-'a'] =i;
            }

            int checkpoint = 0;
            int endpoint =0;

            for (int i = 0; i <s.length() ; i++) {
                int target = s.charAt(i)-'a';

                //가장 늦게끝나는 인덱스를 갱신함
                endpoint = Math.max(endpoint,map[target]);

                if(i == endpoint){
                    //끝나는 문자까지 왔으니 체크포인트 변경
                    answer.add(endpoint-checkpoint+1);
                    checkpoint= i+1;
                }
            }
            return answer;
        }
    }
}
