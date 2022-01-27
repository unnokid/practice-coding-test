package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int rowIndex;
        rowIndex = 3;
        System.out.println(solution.getRow(rowIndex));
    }
    static class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> result = new ArrayList<>();
            //0이면 그냥 없음
            if(rowIndex < 0){
                return result;
            }
            //0이상이면 기본 1 추가해주기
            result.add(1);

            for (int i = 0; i < rowIndex; i++) {
                for (int j = result.size() -2; j >=0 ; j--) {
                    //1개일때는 어쩌나 그냥 1추가
                    //2개일때는 양끝에 꺼 더해서 가운데 추가
                    //3일때는 2번반복하면서 0과 1을 더해서 1자리에 넣기
                    //그다음 반복은 1과 2 를 더해서 1자리에 넣기
                    //이때 마지막으로 1 붙여줘야함


                    int A = result.get(j);//선택한거
                    int B = result.get(j+1);//다음꺼
                    //몇번째 인덱스에 몇번 몇번을 더해야함
                    result.set(j+1, A+B);
                }
                //끝에 1 더하기
                result.add(1);
            }


            return result;
        }
    }
}
