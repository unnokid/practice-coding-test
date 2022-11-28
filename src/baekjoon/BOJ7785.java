package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class BOJ7785 {

    public static void main(String[] args) throws IOException {
        //백준 7785 회사에 있는 사람

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <T ; i++) {
            String[] s = br.readLine().split(" ");
            if(s[1].equals("enter")){
                map.put(s[0],1);
            }else{
                map.remove(s[0]);
            }
        }

        for (String key :map.keySet()){
            if(map.containsKey(key)){
                sb.append(key).append("\n");
            }
        }

        System.out.println(sb);
    }
}
