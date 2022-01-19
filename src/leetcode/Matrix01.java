package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Matrix01 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] mat;
        /*mat = new int[][]{{0,0,0},{0,1,0},{1,1,1}};
        System.out.println(Arrays.deepToString(solution.updateMatrix(mat)));*/
        mat = new int[][]{{1,0,1,1,0,0,1,0,0,1},
                {0,1,1,0,1,0,1,0,1,1},
                {0,0,1,0,1,0,0,1,0,0},
                {1,0,1,0,1,1,1,1,1,1},
                {0,1,0,1,1,0,0,0,0,1},
                {0,0,1,0,1,1,1,0,1,0},
                {0,1,0,1,0,1,0,0,1,1},
                {1,0,0,0,1,1,1,1,0,1},
                {1,1,1,1,1,1,1,0,1,0},
                {1,1,1,1,0,1,0,0,1,1}};
        System.out.println(Arrays.deepToString(solution.updateMatrix(mat)));

    }
    static class Solution {
        public int[][] updateMatrix(int[][] mat) {
            // m x n 매트리스 주어짐
            // 0 배열로 갈라는 최소거리를 나타냄
            
            //0값인 좌표들을 list에 추가해놓음
            ArrayList<Pair> list = new ArrayList<>();
            for (int i = 0; i < mat.length ; i++) {
                for (int j = 0; j <mat[0].length ; j++) {
                    if(mat[i][j] ==0){
                        Pair temp = new Pair(i,j);
                        list.add(temp);
                    }
                }
            }

            for (int i = 0; i <mat.length ; i++) {
                for (int j = 0; j <mat[0].length ; j++) {
                    if(mat[i][j] != 0){
                        //0이 아닌좌표에서 0값을 찾음
                        mat[i][j] = check(list,i,j);
                    }
                }
            }
            return mat;
        }
        public int check(ArrayList<Pair> list,int x,int y){
            int result =Integer.MAX_VALUE;
            int sum =0;
           
            //아까 0값이였던 좌표들을 뽑아서 현재 좌표와 거리를 계산해서 제일 짧은 거리 찾음
            for (int i = 0; i <list.size() ; i++) {
                Pair pair = list.get(i);
                result = Math.min(Math.abs(x-pair.x)+Math.abs(y- pair.y),result);
            }
            return result;
        }

    }
    static class Pair{
        int x,y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }

    }

}
