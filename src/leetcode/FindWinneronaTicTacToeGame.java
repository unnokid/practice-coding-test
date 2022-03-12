package leetcode;

public class FindWinneronaTicTacToeGame {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] moves;
        moves = new int[][]{{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}};
        System.out.println(solution.tictactoe(moves));

    }

    static class Solution {
        public String tictactoe(int[][] moves) {
            //3x3 판 2플레이어 게임
            //A는 X 표시를 배치 B는 O 표시
            //가로 세로 대각선으로 3개 배치시 승리
            //판을 줄때 누가 이겼는지
            int m = moves.length;
            char[][] board = new char[3][3];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    //빈판 만들기
                    board[i][j] = 'X';
                }
            }

            for (int i = 0; i < m; i++) {
                if (i % 2 == 0) {
                    board[moves[i][0]][moves[i][1]] = 'A';
                } else {
                    board[moves[i][0]][moves[i][1]] = 'B';
                }
            }
            //가로 세로
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][1] != 'X') {
                    return board[i][1]+"";
                }
                if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[1][i] != 'X') {
                    return board[1][i]+"";
                }
            }
            
            //대각선
            if ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]) && board[1][1] != 'X') {
                return board[1][1]+"";
            }
            if ((board[2][0] == board[1][1]) && (board[1][1] == board[0][2]) && board[1][1] != 'X') {
                return board[1][1]+"";
            }

            
            //다 있는데도 안끝남
            if (moves.length == 9) {
                return "Draw";
            }else{
                return "Pending";
            }
        }
    }
}
