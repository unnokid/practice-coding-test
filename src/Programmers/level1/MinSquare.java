package Programmers.level1;

public class MinSquare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] sizes;
        sizes = new int[][] {{60,50},{30,70},{60,30},{80,40}};
        System.out.println(solution.solution(sizes));
        sizes = new int[][] {{10,7},{12,3},{8,15},{14,7},{5,15}};
        System.out.println(solution.solution(sizes));
        sizes = new int[][] {{14,4},{19,6},{6,16},{18,7},{7,11}};
        System.out.println(solution.solution(sizes));
    }
    static class Solution {
        public int solution(int[][] sizes) {
            int answer =0;
            
            //명함의 가로 세로가 담긴 배열을 줌
            //다양한 크기를 주는데 이 모든 명함을 다 담을수있는 지갑 제작
            
            //가로 세로 가장 큰 길이를 찾기
            //가로 세로중 큰값을 구하는중에 가로가 더 크게 정렬해야함
            int width  = 0;
            int height = 0;

            for (int i = 0; i < sizes.length; i++) {
                if(sizes[i][0] < sizes[i][1]){
                    int temp = sizes[i][0];
                    sizes[i][0] =sizes[i][1];
                    sizes[i][1] = temp;
                }
            }



            for (int i = 0; i < sizes.length; i++) {
                if(sizes[i][0]>width){
                    width = sizes[i][0];
                }
                if(sizes[i][1]>height){
                    height = sizes[i][1];
                }
            }
            //각각의 최댓값을 구했음
            //두 최댓값중 작은친구의 가로세로를 바꿈
            answer =  width * height;

            return answer;
        }
    }
}
