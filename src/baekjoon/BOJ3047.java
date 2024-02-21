import java.io.*;
import java.util.*;

public class BOJ3047{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[3];
        for(int i =0; i<3;i++){
            arr[i] = Integer.parseInt(split[i]);
        }
        //정렬
        Arrays.sort(arr);
        
        Map<Character, Integer> map = new HashMap<>();
        //입력값이 많으면 for문 아스키코드 대체 가능
        map.put('A',arr[0]);
        map.put('B',arr[1]);
        map.put('C',arr[2]);
        
        String result = br.readLine();
        for(int i =0; i < result.length(); i++){
            char target = result.charAt(i);
            sb.append(map.get(target)).append(" ");
        }
        System.out.println(sb);
    }
}
