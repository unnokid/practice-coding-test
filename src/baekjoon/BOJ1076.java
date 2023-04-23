package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ1076 {
    public static void main(String[] args) throws IOException {
        //백준 1076 저항
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> map = new HashMap<>();

        map.put("black",0);
        map.put("brown",1);
        map.put("red",2);
        map.put("orange",3);
        map.put("yellow",4);
        map.put("green",5);
        map.put("blue",6);
        map.put("violet",7);
        map.put("grey",8);
        map.put("white",9);
        long[] arr = new long[]{1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
        long result = 0;
        for (int i = 0; i < 3; i++) {
            String target = br.readLine();
            if(i ==2){
                result/=10;
                result*=arr[map.get(target)];
            }else{
                result +=map.get(target);
                result*=10;
            }
        }
        System.out.println(result);
    }
}
