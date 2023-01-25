package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BOJ10825 {

    public static void main(String[] args) throws IOException {
        //백준 10825 국영수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<People> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int korea = Integer.parseInt(s[1]);
            int english = Integer.parseInt(s[2]);
            int math = Integer.parseInt(s[3]);
            list.add(new People(s[0],korea,english,math));
        }

        Collections.sort(list, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                if(o1.korea == o2.korea){
                    if(o1.english == o2.english){
                        if(o1.math == o2.math){
                            return o1.name.compareTo(o2.name);
                        }
                        return o2.math-o1.math;
                    }
                    return o1.english - o2.english;
                }
                return o2.korea - o1.korea;
            }
        });
        StringBuilder sb=  new StringBuilder();
        for (int i = 0; i <list.size() ; i++) {
            sb.append(list.get(i).name).append("\n");
        }
        System.out.println(sb);
    }
    static public class People{
        String name;
        int korea;
        int english;
        int math;

        public People(String name, int korea, int english, int math) {
            this.name = name;
            this.korea = korea;
            this.english = english;
            this.math = math;
        }
    }

}
