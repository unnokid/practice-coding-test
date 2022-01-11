package Programmers.level3;

import java.util.HashSet;

public class Balloon {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a;
        a = new int[]{9, -1, -5};
        System.out.println(solution.solution(a));
        a = new int[]{-16, 27, 65, -2, 58, -92, -71, -68, -61, -33};
        System.out.println(solution.solution(a));
    }

    static class Solution {
        public int solution(int[] a) {
            int answer = 0;

            //일렬로 나열된 n개의 풍선
            //모든 풍선에는 서로 다른 숫자
            //1. 임의의 인접한 두풍선 고르고 하나를 터뜨림
            //2. 터진 풍선으로 인해 풍선들 사이에 빈공간이 있다면 풍선을 중앙으로 밀착
            // 인접한 두풍선 중에 작은번호를 터뜨릴수 있는 찬스가 존재함(1회)
            // 나머지는 두 풍선중에 번호가 더 큰 풍선만 터뜨릴 수 있음

            //어떤 풍선이 최후까지 남을지 알고싶음
            //어떤 풍선은 무슨수를 쓰더라도 마지막까지 남길 수 없음
            //위에 규칙을 따라 풍선을 터뜨릴때 최후까지 남기는 것이 가능한 풍선들의 개수를 return

            //a의 길이는 1이상 1,000,000이하임
            //a의 모든수는 -10억~10억임
            //a의 모든수는 서로다름

            //개수가 너무 많아서 전체 체크가 안됨 패턴분석이 필요함

            //양쪽끝애들은 어떻게든 남길수 있는듯

            //1개만 오면 1개끝
            if (a.length == 1) {
                return 1;
            }
            //양쪽은 다 남을수 있음
            // 중간부분에서는 첫시작 값보다 큰게 허용되지않음 최소값일때 기회가 존재함
            HashSet<Integer> set = new HashSet<>();
            int min = a[0];
            //왼쪽부터 합체
            for (int i = 1; i < a.length; i++) {
                set.add(min);
                min = Math.min(a[i], min);
            }
            min = a[a.length - 1];
            //오른쪽 부터 합체
            for (int i = a.length - 2; i >= 0; i--) {
                set.add(min);
                min = Math.min(a[i], min);
            }
            answer = set.size();
            return answer;
        }
    }
}
