package leetcode;

public class GameofLife {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] board;
        board = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        solution.gameOfLife(board);
        board = new int[][]{{1,1},{1,0}};
        solution.gameOfLife(board);
    }
    static class Solution {
        public void gameOfLife(int[][] board) {
            // 살아있는 세포(1)
            // 1.주변에 1이 2개 미만이면 죽음
            // 2.주변에 1이 2~3개이면 다음 세대까지 1
            // 3.주변에 1이 3개를 넘으면 다음 세대까지 죽음
            // 죽은 세포(0)
            // 1.주변에 1의 3개 있으면 살아남
            // 다음 상태를 return

            //target이 1인지 0인지
            //그리고 주변에 1의 개수가 몇개인지 확인

            for (int i = 0; i <board.length ; i++) {
                for (int j = 0; j <board[0].length ; j++) {
                    int count = check(i,j,board);

                    if(board[i][j] ==0 && count == 3){
                        board[i][j] = 3;//3은 바뀌어진 생존
                    }

                    if(board[i][j] == 1 && (count<2 || count >3)){
                        board[i][j] = 2;//2는 바뀌어진 죽음
                    }

                }
            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    board[i][j] %= 2;
                }
            }


        }
        static int check(int i, int j,int[][] board){
            int result =0;
            //8방향 확인
            int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
            int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

            for (int k = 0; k < 8; k++) {
                int x = i+dx[k];
                int y = j+dy[k];

                if(x<0 || x>=board.length || y<0 || y>=board[0].length){
                    continue;
                }

                //살아있거나 다음상태가 죽은경우
                if(board[x][y] == 1 || board[x][y] == 2){
                    result++;
                }
            }
            return result;
        }
    }
}
