import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14913 {
    public static void main(String[] args) throws IOException {
        //백준 14913 등차수열에서 항 번호 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        
        int a = Integer.parseInt(s[0]);
        int d = Integer.parseInt(s[1]);
        int target = Integer.parseInt(s[2]) - a+d;

        
        if(target %d ==0 && target/d>=1){
            System.out.println(target/d);    
        }else{
            System.out.println("X");    
        }
        
    }
}
