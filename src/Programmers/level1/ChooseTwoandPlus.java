package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ChooseTwoandPlus {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers;
        numbers = new int[] {2,1,3,4,1};
        System.out.println(Arrays.toString(solution.solution(numbers)));
        numbers = new int[] {5,0,2,7};
        System.out.println(Arrays.toString(solution.solution(numbers)));
    }
    static class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = {};

            //배열을 주어지는데 서로 다른 인덱스에서 2개를 뽑아 만들 수 있는 모든 수를 배열로 return

            HashSet<Integer> set = new HashSet<>();
            //결국 모든수의 짝이 이루어지고 중복을 제거한뒤에
            //오름차순 정렬후에 리턴의 목표
            for(int count=0;count<numbers.length;count++)
            {
                for(int i=count+1;i<numbers.length;i++)
                {
                    set.add(numbers[count]+numbers[i]);
                }
            }

            //set으로 만든걸 list로 만들어서 get를 써야함
            ArrayList<Integer> list = new ArrayList<>(set);

            answer = new int[list.size()];
            for(int i=0;i<list.size();i++)
            {
                answer[i]=list.get(i);
            }
            //정렬
            Arrays.sort(answer);
            return answer;
        }
    }
}
