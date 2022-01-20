package Programmers.level2;

public class Hopscotch {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] land;
        land = new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        System.out.println(solution.solution(land));
    }
    static class Solution {
        int solution(int[][] land) {
            int answer = 0;

            //4열 고정의 N개의 행이 있다
            // 한 행을 내려올때마다 한칸씩 밟으면서 내려오는데 같은열을 연속해서 밟을 수 없는 규칙
            //각 밟으면서 내려올때 최고점이 되는 값을 구하기

            //한칸씩 내려가기
            for (int i = 0; i < land.length -1; i++) {
                //0을 밟았으면 그다음은 1 2 3 중에 가장 큰수 더하기
                //1을 밟았으면 그다음은 0 2 3 중에 가장 큰수 더하기
                //2을 밟았으면 그다음은 0 1 3 중에 가장 큰수 더하기
                //3을 밟았으면 그다음은 0 1 2 중에 가장 큰수 더하기
                land[i+1][0] += Math.max(land[i][1],Math.max(land[i][2],land[i][3]));
                land[i+1][1] += Math.max(land[i][0],Math.max(land[i][2],land[i][3]));
                land[i+1][2] += Math.max(land[i][0],Math.max(land[i][1],land[i][3]));
                land[i+1][3] += Math.max(land[i][0],Math.max(land[i][1],land[i][2]));
            }
            //쭉내려왓을때 맨아래 발판중 가장 큰수 return
            return Math.max(Math.max(land[land.length-1][0],land[land.length-1][1]),Math.max(land[land.length-1][2],land[land.length-1][3]));
        }
    }
}
