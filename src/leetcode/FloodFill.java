package leetcode;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] image;
        int sr;
        int sc;
        int newColor;
        image = new int[][] {{1,1,1},{1,1,0},{1,0,1}};
        sr =1;
        sc =1;
        newColor =2;
        //.out.println(Arrays.deepToString(solution.floodFill(image, sr, sc, newColor)));
        image = new int[][] {{0,0,0},{0,0,0},{0,0,0}};
        sr =0;
        sc =0;
        newColor =2;
        System.out.println(Arrays.deepToString(solution.floodFill(image, sr, sc, newColor)));
    }
    static class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

            //m x n 그림을 준다.
            //target sr, sc 위치를 준다.
            //그 주위로 시작해서 같은색이면 더해라
            int target = image[sr][sc];
            fill(image,sr,sc,newColor,target);
            return image;
        }
    }
    static void fill(int[][] image, int sr, int sc, int newColor,int target){

        if(sr<0 || sc <0 || sr >image.length -1|| sc > image[0].length-1
                || image[sr][sc] == newColor || image[sr][sc] != target){
            return;
        }

        image[sr][sc] = newColor;
        fill(image,sr+1,sc,newColor,target);
        fill(image,sr-1,sc,newColor,target);
        fill(image,sr,sc+1,newColor,target);
        fill(image,sr,sc-1,newColor,target);


        /*if(sr<0 || sc <0 || sr >image.length -1|| sc > image[0].length-1
                || image[sr][sc] == newColor || image[sr][sc] != target){
            return;
        }
        image[sr][sc] = newColor;
        fill(image,sr+1,sc,newColor,target);
        fill(image,sr-1,sc,newColor,target);
        fill(image,sr,sc+1,newColor,target);
        fill(image,sr,sc-1,newColor,target);*/

    }
}
