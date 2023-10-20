package baekjoon;

import java.io.*;
import java.util.*;

public class BOJ14425{
    public static void main(String[] args) throws IOException{
        //백준 14425 문자열 집합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        String[] words = new String[N];
        Map<String,Integer> map = new HashMap<>();
        
        for(int i =0;i <N;i++){
            words[i] = br.readLine();
            //집합 S는 중복하지 않는다고 함
            map.put(words[i],1);
        }
       
        for(int i =0;i <M;i++){
            String target = br.readLine();
            map.put(target,map.getOrDefault(target,0)+1);
        }
        int result =0;
        for(int i =0;i <N;i++){
            if(map.get(words[i])>1){
                result += map.get(words[i])-1;
            }
        }
        System.out.println(result);
    }
}
