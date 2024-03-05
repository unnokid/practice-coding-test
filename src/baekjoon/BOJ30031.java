import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ30031{
    public static void main(String[] args) throws IOException {
        //백준 30031 지폐 세기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum =0;
        for(int i=0;i<N;i++){
            String[] s = br.readLine().split(" ");
            int target = Integer.parseInt(s[0]);
            if(target == 136){
                sum+=1000;
            }else if(target == 142){
                sum+=5000;
            }else if(target == 148){
                sum+=10000;
            }else{
                sum+=50000;
            }
        }
        System.out.println(sum);
    }
}
