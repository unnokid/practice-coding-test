package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ12891 {
    public static void main(String[] args) throws IOException {
        //백준 12891 DNA 비밀번호

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int P = Integer.parseInt(s[1]);

        String DNA = br.readLine();
        int[] count = new int[4];
        int[] limit = new int[4];
        String[] s1 = br.readLine().split(" ");

        for (int i = 0; i < 4; i++) {
            limit[i] = Integer.parseInt(s1[i]);
        }
        //만족하는 개수
        int result = 0;

        for (int i = 0; i < DNA.length(); i++) {
            char target = DNA.charAt(i);
            count[checkNumber(target)]++;
            if(i < P-1){
                continue;
            }

            if(i >= P){
                count[checkNumber(DNA.charAt(i-P))]--;
            }
            boolean pass =true;
            for (int j = 0; j < 4; j++) {
                if(count[j] < limit[j]){
                    pass =false;
                    break;
                }
            }

            if(pass){
                result++;
            }
        }

        System.out.println(result);
    }
    private static int checkNumber(char target){
        if(target == 'A'){
            return 0;
        }else if(target == 'C'){
            return 1;
        }else if(target == 'G'){
            return 2;
        }else if(target == 'T'){
            return 3;
        }
        return -1;
    }
}
