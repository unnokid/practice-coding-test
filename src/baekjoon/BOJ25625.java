import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25625 {

    public static void main(String[] args) throws IOException {
        //백준 25625 샤틀버스

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        if(x>y){
            System.out.println(y+x);
        }else{
            System.out.println(y%x);
        }
    }
}
