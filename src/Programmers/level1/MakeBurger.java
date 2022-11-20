package Programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class MakeBurger {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ingredient;
        ingredient = new int[]{2,1,1,2,3,1,2,3,1};
        System.out.println(solution.solution(ingredient));
    }
    static class Solution {
        public int solution(int[] ingredient) {
            //프로그래머스 LV 1 햄버거 만들기
            int answer = 0;

            List<Integer> list = new ArrayList<>();

            //햄버거 조합법
            List<Integer> target = new ArrayList<>();
            target.add(1);
            target.add(2);
            target.add(3);
            target.add(1);

            for (int i = 0; i <ingredient.length ; i++) {
                //1 빵, 2 야채, 3 고기
                list.add(ingredient[i]);

                //list 끼리 비교
                if(list.size()>=4){
                    //최근 4개 가져오기
                    List<Integer> temp = new ArrayList<>();
                    temp.add(list.get(list.size()-4));
                    temp.add(list.get(list.size()-3));
                    temp.add(list.get(list.size()-2));
                    temp.add(list.get(list.size()-1));

                    if(temp.equals(target)){
                        //뽑아온게 햄버거 조합이면 최신리스트에서 제거
                        answer++;
                        for (int j = 0; j < 4; j++) {
                            list.remove(list.size()-1);
                        }
                    }
                }
            }


            return answer;
        }
    }
}
