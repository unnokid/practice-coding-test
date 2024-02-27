import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BOJ6359{
    public static void main(String[] args) throws IOException {
        //백준 6359 만취한 상범

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i =0; i <T; i++){
            int n = Integer.parseInt(br.readLine());
            boolean[] room = new boolean[n+1];
            
            for(int j=2; j<=n; j++){
                //라운드 수
                for(int k=j;k<=n;k+=j){
                    //넘어가는 방번호 배수
                    room[k] = !room[k];
                }
            }
            int sum =0;
            for(int j=1;j<=n;j++){
                //열려있는 감옥 개수 구하기
                sum += (!room[j] ? 1:0);
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
