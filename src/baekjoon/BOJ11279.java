package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11279 {
    public static void main(String[] args) throws Exception {
        //백준 11279 최대 힙

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int[] heap = new int[N+1];
        int count =0;
        for (int i = 0; i <N ; i++) {
            int number = Integer.parseInt(br.readLine());
            if(number ==0){
                if(count ==0){
                    //아직 아무것도 없음
                    sb.append(0).append("\n");
                    continue;
                }
                //배열에 무언가가 있음
                //최대힙을 고려한다면 이미 정렬이 되어있어야함
                //그렇다는건 1번에서 제거하고 붙여넣어야함
                //그리고 다시 정렬 시킴
                //정렬방법은 양쪽 자식중에 큰값과 바꾸고 이번엔 반대로 하위로 내려가야함

                //루트 제거
                sb.append(heap[1]).append("\n");
                heap[1] = heap[count];
                heap[count] = 0;
                count--;

                int cur = 1;
                //cur*2 , cur*2 +1 인덱스끼리 서로 비교해야하며 그중 큰값과 교환
                while(cur < count){
                    int target;

                    if(cur*2+1 <= count){
                        //두 자식이 모두 있는 경우
                        if(heap[cur*2] < heap[cur*2 +1]){
                            //오른쪽이 큼
                            target = cur*2+1;
                        }else{
                            //왼쪽이 큼
                            target = cur*2;
                        }
                    }else if(cur *2 <= count){
                        //왼쪽 자식만 존재함
                        target = cur*2;
                    }else{
                        //자식없음
                        break;
                    }

                    //교환
                    if(heap[cur] < heap[target]){
                        int temp = heap[cur];
                        heap[cur] = heap[target];
                        heap[target] = temp;
                        //갱신
                        cur = target;
                    }else{
                        break;
                    }
                }
                continue;
            }

            //여긴 추가 파트
            count++;
            //말단 노드에 추가
            heap[count] = number;
            //말단 노드에서 부터 루트로 거슬러 올라가며 비교하며 자리를 체인지 해야함

            //목표 타겟은 count/2, 그리고 계속 /2 하면서 루트까지 도달하며 체인지
            //만약 target값이 이미 있는 인덱스 값보다 작다면 그곳에서 끝

            int cur = count;
            //루트까지 도달해야하므로 1까지, 그리고 위값보다 커야함
            while(cur > 1 && heap[cur/2] < heap[cur]){
                //target은 목표로 보고있는 위 인덱스
                int target = cur/2;
                int temp = heap[target];
                heap[target] = heap[cur];
                heap[cur] = temp;

                //다음칸으로 이동
                cur = target;
            }
        }
        System.out.println(sb);
    }
}
