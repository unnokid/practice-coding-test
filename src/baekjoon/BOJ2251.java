package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2251 {

    static boolean[] check;
    static boolean[][] visit;
    static int A;
    static int B;
    static int C;
    public static void main(String[] args) throws IOException {
        //백준 2251 물통
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        A = Integer.parseInt(s[0]);
        B = Integer.parseInt(s[1]);
        C = Integer.parseInt(s[2]);
        StringBuilder sb= new StringBuilder();
        //시작할때 A,B는 없고 C에 물이 가득채워짐
        //구하고싶은 조건은 A가 비어있을때 C안에 담겨있을수있는 물의양 종류를 모두 구하기
        //레이튼 교수 추무게 측정과 비슷한 느낌
        check = new boolean[201];
        visit = new boolean[201][201];
        dfs(0,0, C);

        for (int i = 0; i <201 ; i++) {
            if(check[i]){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
    public static void dfs(int a,int b, int c) {
        if(visit[a][b]) {
            return;
        }

        if(a==0) {
            //체크함
            check[c]=true;
        }

        visit[a][b] = true;

        // a -> b
        if(a+b> B) {
            dfs((a+b)- B, B,c);
        }else {
            dfs(0,a+b,c);
        }

        // b -> a
        if(b+a> A) {
            dfs(A,(b+a)- A,c);
        }else {
            dfs(b+a,0,c);
        }

        // c -> a
        if(c+a> A) {
            dfs(A,b,(c+a)- A);
        }else {
            dfs(c+a,b,0);
        }

        // c -> b
        if(c+b> B) {
            dfs(a, B,(c+b)- B);
        }else {
            dfs(a,c+b,0);
        }

        // b -> c
        dfs(a,0,b+c);

        // a -> c
        dfs(0,b, a+c);
    }
}
