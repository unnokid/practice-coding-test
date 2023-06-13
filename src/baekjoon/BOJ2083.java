package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2083 {
    public static void main(String[] args) throws IOException {
        //백준 2083 럭비 클럽

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] s = br.readLine().split(" ");

            String name = s[0];
            int age = Integer.parseInt(s[1]);
            int kg =  Integer.parseInt(s[2]);

            if(age ==0 && kg == 0){
                break;
            }

            sb.append(name).append(" ");
            if(age >17 || kg >=80){
                sb.append("Senior").append("\n");
            }else{
                sb.append("Junior").append("\n");
            }
        }
        System.out.println(sb);
    }
}
