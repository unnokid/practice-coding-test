package Programmers.level2;

import java.util.Arrays;

public class BiggestSquare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][]board;
        board = new int[][]{{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
        System.out.println(solution.solution(board));
        board = new int[][]{{0,0,1,1},{1,1,1,1}};
        System.out.println(solution.solution(board));
    }
    static class Solution
    {
        public int solution(int [][]board)
        {
            int answer = 1;
            //0과 1로 이루어진 표를 주어짐
            //1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return
            //즉 정사각형의 한변을 구해서 제곱해주면 됨

            //1이 존재하는지 확인
            if(!check(board)){
                return 0;
            }


            for (int i = 1; i < board.length; i++) {
                for (int j = 1; j <board[0].length ; j++) {
                    if(board[i][j] == 0){
                        continue;
                    }
                    //가로세로길이 누적으로 더해주기
                    board[i][j] = Math.min(Math.min(board[i - 1][j], board[i][j - 1]), board[i - 1][j - 1]) + 1;
                    System.out.println(Arrays.deepToString(board));
                    answer = Math.max(board[i][j],answer);
                }
            }


            return answer*answer;
        }
        static boolean check(int [][] board){
            for (int i = 0; i <board.length ; i++) {
                for (int j = 0; j <board[0].length ; j++) {
                    if(board[i][j] ==1){
                        return true;
                    }

                }
            }
            return false;

        }
    }
}
