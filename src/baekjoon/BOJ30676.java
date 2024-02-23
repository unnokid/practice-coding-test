package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ30676 {
    public static void main(String[] args) throws IOException {
        //백준 30676 이별은 무슨 색일까
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N>=380 && N<425){
            System.out.println("Violet");
        }else if(N>=425 && N<450){
            System.out.println("Indigo");
        }else if(N>=450 && N<495){
            System.out.println("Blue");
        }else if(N>=495 && N<570){
            System.out.println("Green");
        }else if(N>=570 && N<590){
            System.out.println("Yellow");
        }else if(N>=590 && N<620){
            System.out.println("Orange");

        }else{
            System.out.println("Red");
        }
    }
}
