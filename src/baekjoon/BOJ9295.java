import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9295 {
    public static void main(String[] args) throws IOException {
        //백준 9295 주사위
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String[] s = br.readLine().split(" ");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);
            sb.append("Case ").append(i+1).append(": ").append(A+B).append("\n");
        }
        System.out.println(sb);
    }
}
