package leetcode;

public class RottingOranges {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid;
        grid = new int[][] {{2,1,1},{0,1,1},{1,0,1}};
        System.out.println(solution.orangesRotting(grid));
        grid = new int[][] {{0,2}};
        System.out.println(solution.orangesRotting(grid));
        grid = new int[][] {{2,1,1},{0,1,1},{1,1,0}};
        System.out.println(solution.orangesRotting(grid));
    }
    static class Solution {
        public int orangesRotting(int[][] grid) {

            int result =0;
            int[][] map = new int[grid.length][grid[0].length];
            int[] dx = {0,0,-1,1};
            int[] dy = {1,-1,0,0};
            //전체신선한 귤 세기 및 진행된 귤 행렬 새로 만들기
            for (int i = 0; i <grid.length ; i++) {
                for (int j = 0; j <grid[0].length ; j++) {
                    map[i][j] = grid[i][j];
                    if(grid[i][j] == 1){
                        result++;
                    }
                }
            }
            int time =0;
            //귤이 변했는지 확인해야함
            int before=0;
            int after=0;
            //신선한 귤이 없을때 까지 반복
            while(result>0){
                before = result;
                for (int i = 0; i <grid.length ; i++) {
                    for (int j = 0; j <grid[0].length ; j++) {
                        if(grid[i][j] == 2){
                            //4방향으로 다 2만들기
                            for (int k = 0; k < 4; k++) {
                                int newX = i+dx[k];
                                int newY = j+dy[k];
                                //배열 인덱스 처리
                                if(newX<0 || grid.length <= newX){
                                    newX = i;
                                }
                                if(newY<0 || grid[0].length <= newY){
                                    newY = j;
                                }
                                //4방향움직인 인덱스중 신선한것이 있다면 썩고 전체에서 1개빼기
                                if(map[newX][newY] == 1){
                                    map[newX][newY] = 2;
                                    result--;
                                }
                            }
                        }
                    }
                }
                //썩었는데 개수의 변함이없으면 그건 거리가안닿음
                after = result;
                if(before == after){
                    return -1;
                }

                //다음 시간지난 오렌지 맵 복사
                for(int i=0; i<grid.length; i++){
                    System.arraycopy(map[i], 0, grid[i], 0, map[0].length);
                }
                time++;
            }

            return time;
        }
    }
}
