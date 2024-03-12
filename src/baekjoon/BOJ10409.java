import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //백준 10409 서버

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
    
        int n = Integer.parseInt(s[0]);
        int T = Integer.parseInt(s[1]);
        int count =0;
     
        String[] table = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            int target = Integer.parseInt(table[i]);
            if(T>=target){
                T-=target;
                count++;
            }else{
                break;   
            }
        }
        System.out.println(count);
    }
}
