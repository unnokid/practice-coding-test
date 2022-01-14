package Programmers.level2;

import java.util.Arrays;

public class Carpet {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int brown;
        int yellow;
        brown = 10;
        yellow = 2;
        System.out.println(Arrays.toString(solution.solution(brown, yellow)));
        brown = 8;
        yellow = 1;
        System.out.println(Arrays.toString(solution.solution(brown, yellow)));
        brown = 24;
        yellow = 24;
        System.out.println(Arrays.toString(solution.solution(brown, yellow)));
    }
    static class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];

            //카펫을 봤는데 중앙에는 노랑색, 테두리는 갈색으로 칠함
            //노란색과 갈색의 개수를 기억하지만 카펫전체 크기를 기억못함
            //갈색 개수와 노랑 개수를 주어지면
            //카펫의 가로 세로 크기를 순서대로 담아서 return
            //카펫의 조건 가로길이<=세로길이



            //갈색이 노랑색을 감싸야 한다
            //먼저 노랑의 직사각형 모양을 만들고 가로, 세로를 만든뒤
            //그 직사각형을 감싸려면 (가로x2+세로x2+4) 만큼의 갈색블록이 필요하다.
            //2가지 경우가 나올수도있음 따라서 가로부터 길게 시작해서 만들기
            for (int i = 1; i <= yellow; i++) {
                int width =0;
                int height =0;
                //노랑 직사각형 만드는 중(가로긴거부터 찾기)
                if(yellow % i ==0){
                    width = Math.max(yellow/i,i);
                    height = Math.min(yellow/i,i);
                }
                //sum이 갈색 블록과 맞아야함
                int sum = height*2 + width*2 +4;
                if(brown == sum){
                    answer[0] = width+2;
                    answer[1] = height+2;
                    break;
                }
            }
            return answer;
        }
    }
}
