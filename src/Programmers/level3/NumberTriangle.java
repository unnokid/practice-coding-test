package Programmers.level3;

public class NumberTriangle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] t;
        t = new int[][] {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
        System.out.println(solution.solution(t));
    }
    static class Solution {
        public int solution(int[][] triangle) {
            int answer = 0;

            //삼각형 꼭대기에서 바닥까지 가는 경로중 숫자합이 가장 큰 경우 찾기
            //아래로 이동시 오른쪽 왼쪽 한칸으로만 가능함

            //맨위 숫자 아래에 더해주기
            triangle[1][0]+=triangle[0][0];
            triangle[1][1]+=triangle[0][0];
            for (int i = 1; i < triangle.length-1; i++) {
                for (int j = 0; j < triangle[i+1].length; j++) {
                    //맨 왼쪽
                    if(j == 0){
                        triangle[i+1][j] += triangle[i][j];
                    }
                    // 중간에 위치
                    else if(j == triangle[i+1].length-1){
                        triangle[i+1][j] += triangle[i][j-1];
                    }
                    //맨 오른쪽
                    else{
                        triangle[i+1][j] += Math.max(triangle[i][j-1],triangle[i][j]);
                    }
                }

            }

            //맨 아래 다 더해진 배열에서 가장 큰수 구하기
            for (int i = 0; i < triangle[triangle.length-1].length-1; i++) {
                if(answer < triangle[triangle.length-1][i]){
                    answer= triangle[triangle.length-1][i];
                }
            }

            return answer;
        }
    }
}
