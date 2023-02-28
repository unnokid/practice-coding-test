package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ2628 {

    public static void main(String[] args) throws IOException {
        //백준 2628 종이 자르기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int w = Integer.parseInt(s[0]);
        int h = Integer.parseInt(s[1]);
        int num = Integer.parseInt(br.readLine());

        ArrayList<Integer> width = new ArrayList<>();
        ArrayList<Integer> height = new ArrayList<>();

        width.add(0);
        height.add(0);
        width.add(h);
        height.add(w);

        for(int i=0; i<num; i++) {
            String[] s1 = br.readLine().split(" ");
            int dir = Integer.parseInt(s1[0]);
            if(dir==0){
                width.add(Integer.parseInt(s1[1]));
            }
            else{
                height.add(Integer.parseInt(s1[1]));
            }
        }

        //정렬
        Collections.sort(width);
        Collections.sort(height);

        ArrayList<Integer> map = new ArrayList<>();

        for(int i=1; i<width.size(); i++) {
            int n = width.get(i)-width.get(i-1);

            for(int j=1; j<height.size(); j++) {
                int r = height.get(j)-height.get(j-1);

                map.add(n * r);
            }
        }
        Collections.sort(map);
        System.out.println(map.get(map.size()-1));
    }
}
