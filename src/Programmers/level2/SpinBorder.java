package Programmers.level2;

public class SpinBorder {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int rows;
        int columns;
        int[][] queries;
        rows = 6;
        columns =6;
        queries = new int[][] {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        System.out.println(solution.solution(rows,columns,queries));
        rows = 3;
        columns =3;
        queries = new int[][] {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
        System.out.println(solution.solution(rows,columns,queries));
        rows = 100;
        columns =97;
        queries = new int[][] {{1,1,100,97}};
        System.out.println(solution.solution(rows,columns,queries));
    }
    static class Solution {
        public int[] solution(int rows, int columns, int[][] queries) {

            //rows x columns 행렬이 주어짐
            // 1부터 순서대로 쭉 숫자가 나열되어짐
            //queries 배열에  x1,y1  x2,y2 배열이 주어짐
            //x1행 y1열 부터 x2행 y2열까지 해당하는 직사각형 테두리 숫자들을 시계방향 회전
            //회전에 의해 위치가 바뀐 숫자들중 가장 작은 숫자들을 순서대로 배열에 담아 return

            int round =0;
            //map 생성 및 숫자 집어넣기
            int map[][] = new int[rows][columns];
            int number=1;
            int result[] = new int[queries.length];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    map[i][j]=number;
                    number++;
                }
            }
            
            //회전하는 라운드 돌리기
            while(round < queries.length){
                //배열 인덱스값으로 주어야하므로 -1씩하기
                int x1= queries[round][0]-1;
                int y1= queries[round][1]-1;
                int x2= queries[round][2]-1;
                int y2= queries[round][3]-1;

                map=rotation(x1,y1,x2,y2,map);
                result[round] = searchMin(x1,y1,x2,y2,map);
                round++;
            }
            return result;
        }

        static int searchMin(int x1, int y1, int x2, int y2, int[][] map){
            //테두리중 가장 작은 숫자 찾기
            int count= 0;
            int min=10001;
            for (int i = 0; i < ((x2-x1)+(y2-y1))*2; i++) {
                int temp;

                if(i == y2-y1 || i == y2-y1+x2-x1 || i==((y2-y1)*2 + x2-x1) || i == (y2-y1+x2-x1)*2 ){
                    count=0;
                }

                if(i<y2-y1){
                    temp = map[x1][y1+count];
                    count++;
                }
                else if(i<y2-y1+x2-x1){
                    temp = map[x1+count][y2];
                    count++;
                }

                else if(i<((y2-y1)*2 + x2-x1)){
                    temp = map[x2][y2-count];
                    count++;
                }
                else{// i<(y2-y1+x2-x1)*2
                    temp = map[x2-count][y1];
                    count++;
                }

                if(temp < min){
                    min = temp;
                }
            }

            return min;
        }
        static int[][] rotation(int x1, int y1, int x2, int y2,int[][] map){
            //회전시키기
            //반복을 총몇번할지 그 횟수에서 분야를 4개로 나눠야함
            int count= 0;
            int front=0;
            int back=0;
            for (int i = 0; i < ((x2-x1)+(y2-y1))*2; i++) {

                if(i==0){
                    front = map[x1][y1];
                }
                if(i == y2-y1 || i == y2-y1+x2-x1 || i==((y2-y1)*2 + x2-x1) || i == (y2-y1+x2-x1)*2 ){
                    count=0;
                }

                if(i<y2-y1){
                    back =map[x1][y1+count+1];
                    map[x1][y1+count+1] = front;
                    front = back;
                    count++;
                }
                else if(i<y2-y1+x2-x1){
                    back = map[x1+count+1][y2];
                    map[x1+count+1][y2] = front;
                    front = back;
                    count++;
                }

                else if(i<((y2-y1)*2 + x2-x1)){
                    back = map[x2][y2-count-1];
                    map[x2][y2-count-1] = front;
                    front = back;
                    count++;
                }
                else{// i<(y2-y1+x2-x1)*2
                    back = map[x2-count-1][y1];
                    map[x2-count-1][y1] = front;
                    front = back;
                    count++;
                }
            }
            return map;
        }
    }
}
