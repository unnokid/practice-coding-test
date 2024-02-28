import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17389 {

    public static void main(String[] args) throws IOException {
        //백준 17389 보너스 점수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        int total =0;
        int bonus =0;
        for(int i=0;i<N;i++){
            char target = s.charAt(i);
            total+= target =='O'? i+1+bonus:0;
            bonus = target =='O'? bonus+1:0;
        }
        System.out.println(total);
        
    }
}
