package Programmers.level2;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] citations;
        citations = new int[]{3, 0, 6, 1, 5};
        System.out.println(solution.solution(citations));
    }
    static class Solution {
        public int solution(int[] citations) {
            int answer = 0;

            //H-index 지표 를 구하는 h를 구하려고함
            //발표한 논문 n편중 , h번 이상 인용된 논문이 h편 이상이고 나머지논문이 h번 이하 인용되었다면 h의 최대값이 ==H-index
            // 어떤 과학자가 발표한 논문의 인용 회수를 담은 배열 citations 가 매개변수로 주어짐
            //H-index을 return 하도록
            //length가 발표한 논문의 수
            // 그중 3편의 논문은 3회 이상 인용되어짐
            //나머지 2편은 3회 이하 인용되었기 때문에 이 과학자의 H인덱스는 3 이다

            int n= citations.length;
            int h;
            Arrays.sort(citations);
            int count =0;
            for(int i=0;i<=n;i++){
                //조건을 2개 만족해야됨
                //h보다 큰배열개수 >= h
                //h보다 작은 배열의 개수 <= h
                if(morecount(citations,i) >= i&& lesscount(citations,i) <= i){
                    answer = i;
                }
            }
            return answer;
        }
        static int morecount(int[] A, int count){
            int result=0;

            for(int i=0;i<A.length;i++){
                if(count<= A[i]){
                    result++;
                }
            }

            return result;
        }

        static int lesscount(int[] A, int count){
            int result=0;

            for(int i=0;i<A.length;i++){
                if(count>= A[i]){
                    result++;
                }
            }

            return result;
        }

    }
}
