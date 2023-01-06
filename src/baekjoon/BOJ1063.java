package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1063 {

    public static void main(String[] args) throws IOException {
        //백준 1063 킹

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        char[] king = s[0].toCharArray();
        char[] stone = s[1].toCharArray();
        int N = Integer.parseInt(s[2]);

        for(int i=0; i<N; i++) {
            String moving = br.readLine();
            
            //배열만 새로 복사
            char[] nextKing = king.clone();
            char[] nextStone = stone.clone();
            move(moving, nextKing);
            if(check(nextKing)){
                //범위 끝
                continue;
            }

            //같은 위치인가
            if(Arrays.equals(nextKing, nextStone)) {
                move(moving, nextStone);
                if(check(nextStone)){
                    //범위 끝
                    continue;
                }

            }
            king = nextKing;
            stone = nextStone;
        }

        System.out.println(king);
        System.out.println(stone);
    }
    static boolean check(char[] arr) {
        return (arr[0]<'A' || arr[0]>'H' || arr[1]<'1' || arr[1]>'8');
    }
    static void move(String move, char[] arr) {
        switch (move) {
            case "R":
                arr[0]++;
                break;
            case "L":
                arr[0]--;
                break;
            case "B":
                arr[1]--;
                break;
            case "T":
                arr[1]++;
                break;
            case "RT":
                arr[0]++;
                arr[1]++;
                break;
            case "LT":
                arr[0]--;
                arr[1]++;
                break;
            case "RB":
                arr[0]++;
                arr[1]--;
                break;
            case "LB":
                arr[0]--;
                arr[1]--;
                break;
        }
    }
}
