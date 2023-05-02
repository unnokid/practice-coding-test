package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ1174 {
    static int N;
    static int[] arr = new int[]{9,8,7,6,5,4,3,2,1,0};
    static List<Long> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        //백준 1174 줄어드는 수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        //줄어들기 위해서는 같은수가 존재해선 안된다
        //무조건 그다음숫자자리는 전보다 작은 숫자로 내려가야함

        dfs(0,0);
        Collections.sort(list);

        //모든 줄어드는 수를 찾아도 전체 크기가 1023개 이다
        if(N >1023){
            System.out.println(-1);
        }else{
            System.out.println(list.get(N-1));
        }
    }
    private static void dfs(long sum, int idx){

        if(!list.contains(sum)){
            //찾은적이 없는 수
            list.add(sum);
        }

        //0보다 더 작은 수를 집어넣을 순 없기에 종료
        if(idx >9){
            return;
        }

        //현재 idx에 있는 숫자를 선택할지 or 선택안할지에 따른 dfs
        dfs(sum*10+arr[idx], idx+1);
        dfs(sum,idx+1);
    }
}
