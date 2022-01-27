package leetcode;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix;
        matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        solution.rotate(matrix);
    }
    static class Solution {
        public void rotate(int[][] matrix) {

            // n x n 2차원 행렬을 줄때 다른 배열을 생성하지말고 
            // 이 자체에서 수정해서 회전시키기


            int n = matrix.length;
            int count = n%2==0 ? n/2 : n/2+1;
            //짝수이냐 홀수이냐
            int target = n-1;//길이가 3이면 딱 2번돌아야됨 한칸 모자라야됨

            //짝수 홀수 계산한 만큼 반복함
            for (int i = 0; i < count; i++) {

                for (int j = 0; j < target; j++) {

                    //회전 j로 한칸씩 옆으로 밀면서 이동 1, 2, 3
                    //처음엔 matrix[0][0]
                    //m[0][0]=matrix[2][0]
                    //m[2][0] = m[0][2];
                    //m[0][2] = m[0][0];

                    //그런다음 j 1 됨
                    //temp = m[0][1]
                    //m[0][1] = m [1][0]
                    //m[1][0] = m[2][1]
                    //m[1][3-1-0] (m[1][2]) = temp

                    //j로 가로 카운트 밀기
                    int temp = matrix[i][i+j]; // 제일 왼쪽위
                    matrix[i][i+j] = matrix[n-1-i-j][i]; // 제일 왼쪽위에 = 제일 오른쪽위값
                    matrix[n-1-i-j][i] = matrix[n-1-i][n-1-i-j];// 제일 오른쪽위값 = 제일 오른쪽아래값
                    matrix[n-1-i][n-1-i-j] = matrix[i+j][n-1-i];// 제일 오른쪽아래값 = 제일 왼쪽아래값
                    matrix[i+j][n-1-i] = temp; //제일 왼쪽아래값 = 제일 왼쪽 위값
                }
                //2칸 줄이기
                target-=2;
            }
            System.out.println(Arrays.deepToString(matrix));


        }
    }
}
