package Programmers.level1;

import java.util.Stack;

public class Crain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] board;
        int[] moves;
        board = new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        moves = new int[]{1,5,3,5,1,2,1,4};
        System.out.println(solution.solution(board,moves));
    }
    static class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();

            //인형뽑기
            //board 배열을 주며 moves에 대한 배열로 몇번째 칸인형을 뽑을지 고름
            //moves를 보여 맨위에 있는 인형을 제거하여 바구니에 넣고 동일한 인형이 뽑이면 터짐
            //이때 사라진 인형 개수 return

            for (int moveCount = 0; moveCount < moves.length; moveCount++) {
                for (int boardNumber = 0; boardNumber < board.length; boardNumber++) {
                    if(board[boardNumber][moves[moveCount]-1] != 0){
                        if(!stack.isEmpty() && stack.peek() == board[boardNumber][moves[moveCount]-1]){
                            stack.pop();
                            answer+=2;
                        }
                        else{
                            stack.push(board[boardNumber][moves[moveCount]-1]);

                        }
                        board[boardNumber][moves[moveCount]-1]=0;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
