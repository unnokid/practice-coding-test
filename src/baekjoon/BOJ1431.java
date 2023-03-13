package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BOJ1431 {

    public static void main(String[] args) throws IOException {
        //백준 1431 시리얼 번호

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i <N ; i++) {
            list.add(br.readLine());
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()){
                    return o1.length() - o2.length();
                }else{
                    int target = check(o1,o2);
                    if(target ==0){
                        return o1.compareTo(o2);
                    }else{
                        return target;
                    }
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <list.size() ; i++) {
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb);
    }
    private static int check(String o1, String o2){
        int first =0;
        int second = 0;

        //서로 같은 길이
        for (int i = 0; i <o1.length() ; i++) {
            if(o1.charAt(i) <= '9' && o1.charAt(i) >= '0'){
                first += o1.charAt(i) -'0';
            }
            if(o2.charAt(i) <= '9' && o2.charAt(i) >= '0'){
                second += o2.charAt(i) -'0';
            }
        }
        return first - second;
    }
}
