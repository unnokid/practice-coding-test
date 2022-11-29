package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ8979 {

    public static void main(String[] args) throws IOException {
        //백준 8979 올림픽

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        int[][] arr = new int[N][5];

        for (int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");

            arr[i][0] = Integer.parseInt(temp[0]);
            arr[i][1] = Integer.parseInt(temp[1]);
            arr[i][2] = Integer.parseInt(temp[2]);
            arr[i][3] = Integer.parseInt(temp[3]);
            arr[i][4] = 1;
        }

        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {

                if (o1[1] < o2[1]) {
                    return 1;
                } else if (o1[1] == o2[1]) {
                    if (o1[2] < o2[2]) {
                        return 1;
                    } else if (o1[2] == o2[2]) {
                        if (o1[3] < o2[3]) {
                            return 1;
                        } else if (o1[3] == o2[3]) {
                            if (o1[0] > o2[1]) {
                                return 1;
                            }
                        }
                    }
                }
                return -1;
            }
        });

        for (int i = 1; i < N; i++) {
            if (arr[i][1] == arr[i - 1][1] && arr[i][2] == arr[i - 1][2]
                && arr[i][3] == arr[i - 1][3]) {
                arr[i][4] = arr[i - 1][4];
            } else {
                arr[i][4] = i + 1;
            }
        }

        for (int i = 0; i < N; i++) {
            if (arr[i][0] == K) {
                System.out.println(arr[i][4]);
                break;
            }
        }

    }
}
