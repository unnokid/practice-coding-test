import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ28431 {
    public static void main(String[] args) throws IOException {
        //백준 28431 양말 짝 맞추기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i <5 ; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 ==1){
                System.out.println(i); 
                break;
            }
        }
    }
}
