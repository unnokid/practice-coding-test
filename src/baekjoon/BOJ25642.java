package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25642 {
    public static void main(String[] args) throws IOException {
        //백준 25642 젓가락 게임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);

        boolean attack = true;

        while(A<5 && B <5){
            if(attack){
                B+=A;
                attack = false;
            }else{
                A+=B;
                attack = true;
            }
        }

        System.out.println(A>=5 ? "yj":"yt");
    }
}
