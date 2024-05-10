package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ27736 {
    public static void main(String[] args) throws IOException {
        //백준 27736 찬반투표
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        int limit = N%2 ==0 ? N/2 : N/2 +1;

        int approved =0;
        int invalid =0;
        int rejected =0;
        for (int i = 0; i < N; i++) {
            int target = Integer.parseInt(s[i]);
            if(target ==0){
                invalid++;
                if(invalid >=limit){
                    System.out.println("INVALID");
                    return;
                }
            }else if(target ==1){
                approved++;
            }else{
                rejected++;
            }
        }
        if (approved > rejected) {
            System.out.println("APPROVED");
        } else {
            System.out.println("REJECTED");
        }
    }
}
