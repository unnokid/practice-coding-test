package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class BOJ5671 {
    public static void main(String[] args) throws IOException {
        //백준 5671 호텔 방 번호
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNextInt() ) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int result = 0;
            for (int i = start; i <= end; i++) {
                int num = i;
                boolean[] pass = new boolean[10];
                boolean check = false;
                while (num > 0) {
                    int target = num % 10;
                    if (pass[target]) {
                        check = true;
                        break;
                    }
                    pass[target] = true;
                    num /= 10;
                }

                if (!check) {
                    result++;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
