package Programmers.level2;

public class QuadCount {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr;
        arr = new int[][] {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
        System.out.println(solution.solution(arr));
        arr = new int[][] {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};
        System.out.println(solution.solution(arr));
    }
    static class Solution {
        static int[] answer;
        public int[] solution(int[][] arr) {
            answer = new int[2];
            // 2^n 2^n 배열을 줌
            //특정영역에서 모든수가 같은 값이면 하나의 수로 압축함
            //압축했을때 배열에 최종적으로 남은 0개수와 1의 개수 return
            quad(arr.length,0,0,arr);
            return answer;
        }
        static void quad(int n,int y,int x, int[][] arr){
            if(n==1){
                answer[arr[y][x]]++;
                return;
            }
            if(isBlock(n,y,x,arr)){
                return;
            }
            //4개 분야로 쪼개기
            quad(n/2, y, x, arr);
            quad(n/2, y+n/2,x,arr);
            quad(n/2,y,x+ n/2,arr);
            quad(n/2, y+ n/2,x+n/2,arr);
        }
        static boolean isBlock(int n, int y, int x, int[][] arr){

            //다같은 수인지 확인
            for (int i = y; i < y+n; i++) {
                for (int j = x; j < x+n; j++) {
                    if(arr[y][x] != arr[i][j]){
                        return false;
                    }
                }
            }
            answer[arr[y][x]]++;
            return true;
        }
    }
}
