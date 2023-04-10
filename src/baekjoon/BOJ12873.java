package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ12873 {
    public static void main(String[] args) throws IOException {
        //백준 12873 기념품

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <=N ; i++) {
            list.add(i);
        }

        //시작지점
        int start = 0;
        for (int i = 1; i < N ; i++) {

            //3 제곱
            int target = i;
            target*=i;
            target%=list.size();
            target*=i;
            target%=list.size();

            //넘어 움직이는 수가 start에서 시작
            target= start+target-1; // 실제는 0이 1이니까

            //list 초과시 한단계 넘어가기
            target%=list.size();

            //만약 계산했는데 제자리로 돌아온다면 -1값이 될 수 있음
            if(target <0){
                target+=list.size();
            }
            start = target;
            list.remove(start);
        }
        System.out.println(list.get(0));

    }
}
