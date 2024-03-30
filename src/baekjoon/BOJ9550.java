import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9550 {
    public static void main(String[] args) throws IOException {
        //백준 9550 아이들은 사탕을 좋아해
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            int people =0;
            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int K = Integer.parseInt(s[1]);
            
            String[] candy = br.readLine().split(" ");
            for(int j=0;j<N;j++){
                int target = Integer.parseInt(candy[j]);
                people+= (target/K);
            }
            sb.append(people).append("\n");
        }
        System.out.println(sb);
    }
}
