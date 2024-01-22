import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        String[] s = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i =0 ; i<N; i++){
            list.add(Integer.parseInt(s[i]), i+1);
        }
        for(int i =N-1; i>=0; i--){
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
