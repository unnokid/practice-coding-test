package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ1251 {

    public static void main(String[] args) throws IOException {
        //백준 1251 단어 나누기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        List<String> list = new ArrayList<>();
        String[] temp = new String[3];

        for (int j = 1; j < s.length() - 1; j++) {
            for (int k = j + 1; k < s.length(); k++) {

                temp[0] = s.substring(0, j);
                temp[1] = s.substring(j, k);
                temp[2] = s.substring(k);

                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 3; i++) {
                    for (int l = temp[i].length()-1; l >=0 ; l--) {
                        sb.append(temp[i].charAt(l));
                    }
                }

                list.add(sb.toString());

            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }

}
