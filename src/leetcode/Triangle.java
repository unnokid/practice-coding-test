package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> triangle;
        triangle = new ArrayList<List<Integer>>(
                Arrays.asList(Arrays.asList(2),Arrays.asList(3,4),Arrays.asList(6,5,7),Arrays.asList(4,1,8,3))
        );
        System.out.println(solution.minimumTotal(triangle));
    }
    static class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            //삼각형에 대한 리스트 정보를 줄 때
            //맨위에서 아래로 내려오면서 가장 최소값을 찾아 return

            //반대로 아래에서 위로 최솟값을 보며 더하기
            for (int i = triangle.size()-2; i>=0; i--) {
                for (int j = 0; j <=i; j++) {
                    //아래에서부터 2칸씩 관찰함
                    //next는 아래시점 리스트
                    List<Integer> next = triangle.get(i+1);
                    //아래 시점의 j,j+1 위치의 최솟값 비교후 위칸인 i칸 j번째와 더한뒤 넣기
                    int target = Math.min(next.get(j),next.get(j+1)) + triangle.get(i).get(j);
                    triangle.get(i).set(j,target);
                }
            }
            return triangle.get(0).get(0);
        }
    }
}
