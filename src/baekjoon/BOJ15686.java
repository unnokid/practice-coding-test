package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ15686 {
    static int min = Integer.MAX_VALUE;
    static List<Point> house = new ArrayList<>();
    static List<Point> chicken = new ArrayList<>();
    static int[][] map;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        //백준 15686 치킨 배달

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        map = new int[N][N];

        for (int i = 0; i <N ; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j <N ; j++) {
                map[i][j] = Integer.parseInt(temp[j]);

                if(map[i][j] == 1){
                    //집
                    house.add(new Point(i,j));
                }else if(map[i][j] ==2){
                    //치킨
                    chicken.add(new Point(i,j));
                }
            }
        }

        visit = new boolean[chicken.size()];

        checking(0,0, M);
        System.out.println(min);
    }
    static void checking(int count, int start,int target){
        if(count ==target){
            //목표 개수 달성
            int total =0;

            for (int i = 0; i <house.size() ; i++) {
                int sum = Integer.MAX_VALUE;
                for (int j = 0; j <chicken.size() ; j++) {
                    if(visit[j]){
                        int distance = Math.abs(house.get(i).x - chicken.get(j).x)
                            + Math.abs(house.get(i).y - chicken.get(j).y);
                        sum = Math.min(distance,sum);
                    }
                }
                total+=sum;
            }
            min = Math.min(total,min);
            return;
        }

        for (int i = start; i <chicken.size() ; i++) {
            if(!visit[i]){
                visit[i] = true;
                checking(count+1,i+1,target);
                visit[i] = false;
            }
        }
    }
    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
