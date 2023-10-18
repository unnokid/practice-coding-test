package baekjoon;

import java.util.*;
import java.io.*;
public class BOJ1864 {
    public static void main(String[] args) throws IOException {
        //백준 1864 문어숫자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> map = new HashMap<>();
        map.put("-",0);
        map.put("\\",1);
        map.put("(",2);
        map.put("@",3);
        map.put("?",4);
        map.put(">",5);
        map.put("&",6);
        map.put("%",7);
        map.put("/",-1);

        while(true){
            int result =0;
            String s = br.readLine();
            if(s.equals("#")){
                break;
            }
            for(int i =0;i<s.length();i++){
                String temp = String.valueOf(s.charAt(i));
                result += Math.pow(8,s.length()-i-1)*map.get(temp);
            }
            System.out.println(result);
        }
    }
}

