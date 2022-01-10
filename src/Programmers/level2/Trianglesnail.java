package Programmers.level2;

import java.util.Arrays;

public class Trianglesnail {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=4;
        System.out.println(Arrays.toString(solution.solution(n)));
        n=5;
        System.out.println(Arrays.toString(solution.solution(n)));
        n=6;
        System.out.println(Arrays.toString(solution.solution(n)));
    }
    static class Solution {
        public int[] solution(int n) {
            int[] answer = new int[n*(n+1)/2];
            int[][] map = new int[n][n];
            //2차원 배열 이용
            int number =1 ;//순서대로 들어갈 값
            int h =-1;//현재 행렬의 좌표 시작할때 바로 0,0 이 되야되니까
            int w =0;//현재 행렬의 좌표
            //n에 개수에 따라 달팽이가 도는 횟수도 동일함
            //i가 외각을 도는 순서 그렇다면
            // i=0이면 왼쪽아래대각선 ->행렬에서는 아래로 한칸
            // i=1이면 오른쪽 직선 -> 오른쪽으로 한칸
            // i=2이면 왼쪽위대각선 -> 위로 왼쪽으로 한칸씩
            for(int i=0;i<n;i++){
                //두번째로 다시 아래로 갈때의 조건도 필요함
                for(int j=i; j<n;j++){
                    if(i%3==0){
                        //아래로 한칸
                        h++;
                    }
                    else if(i%3==1){
                        //오른쪽으로 한칸
                        w++;
                    }
                    else { //나머지가 2 갰죠
                        //위로한칸,왼쪽으로 한칸
                        h--;
                        w--;
                    }
                    map[h][w] = number;
                    number++;
                }
            }

            int Index =0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(map[i][j] == 0){
                        break;
                    }
                    answer[Index] = map[i][j];
                    Index++;
                }
            }

            return answer;
        }
    }

}
