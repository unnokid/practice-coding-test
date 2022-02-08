package leetcode;

public class ValidSudoku {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] board;
        board = new char[][]{{'5','3','.','.','7','.','.','.','.'}
                            ,{'6','.','.','1','9','5','.','.','.'}
                            ,{'.','9','8','.','.','.','.','6','.'}
                            ,{'8','.','.','.','6','.','.','.','3'}
                            ,{'4','.','.','8','.','3','.','.','1'}
                            ,{'7','.','.','.','2','.','.','.','6'}
                            ,{'.','6','.','.','.','.','2','8','.'}
                            ,{'.','.','.','4','1','9','.','.','5'}
                            ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(solution.isValidSudoku(board));
    }
    static class Solution {
        public boolean isValidSudoku(char[][] board) {
            //스도쿠 규칙으로써 존재하는 숫자가 올바른 스도쿠인지 판단해서 return

            //따져야 할 조건
            //가로 줄
            //세로 줄
            //작은 직사각형

            //세로줄 가로줄 조건 탐색
            for (int i = 0; i <9 ; i++) {
                boolean checkW[] = new boolean[10];
                boolean checkH[] = new boolean[10];
                for (int j = 0; j <9 ; j++) {
                    if(board[i][j] != '.'){
                        //세로줄
                        int target = Integer.parseInt(String.valueOf(board[i][j]));
                        System.out.println(target);
                        if(!checkH[target]){
                            checkH[target] = true;
                        }else{
                            return false;
                        }
                    }

                    //가로줄
                    if(board[j][i] != '.'){
                        int target = Integer.parseInt(String.valueOf(board[j][i]));
                        if(!checkW[target]){
                            checkW[target] = true;
                        }else{
                            return false;
                        }
                    }

                }
            }

            //작은 직사각형
            for (int i = 0; i < 9; i=i+3) {
                for (int j = 0; j < 9; j=j+3) {
                    if(!check(i,j,board)){
                        return false;
                    }
                }
            }
            return true;

        }
        public boolean check(int x, int y, char[][] board){
            boolean count[] = new boolean[10];
            for (int i = x; i <x+3 ; i++) {
                for (int j = y; j <y+3 ; j++) {
                    if(board[i][j] == '.'){
                        continue;
                    }else{
                        int target = Integer.parseInt(String.valueOf(board[i][j]));
                        if(!count[target]){
                            count[target] = true;
                        }else{
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}
