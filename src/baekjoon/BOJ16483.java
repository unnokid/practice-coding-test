import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ16483 {
    public static void main(String[] args) throws IOException {
        //백준 16483 접시 안의 원
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(Math.round((double)N*N/4));
    }
}
