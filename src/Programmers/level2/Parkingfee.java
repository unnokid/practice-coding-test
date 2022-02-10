package Programmers.level2;

import java.util.Arrays;

public class Parkingfee {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] fees;
        String[] records;
        fees = new int[]{180,5000,10,600};
        records = new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(Arrays.toString(solution.solution(fees, records)));
        fees = new int[]{120, 0, 60, 591};
        records = new String[]{"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
        System.out.println(Arrays.toString(solution.solution(fees, records)));
        fees = new int[]{180,5000,10,600};
        records = new String[]{"00:00 1234 IN"};
        System.out.println(Arrays.toString(solution.solution(fees, records)));
    }
    static class Solution {
        public int[] solution(int[] fees, String[] records) {
            int[] answer = {};
            int basetime = fees[0];
            int basefee = fees[1];
            int overtime = fees[2];
            int overfee = fees[3];

            int[] cartime = new int[10000];//시간이 들어감
            int[] carnumber = new int[10000];//등록된 차량 확인
            int count =0;
            //차량의 종류 개수를 알아야되구요 배열만들어야되니까
            //그리고 차량 인아웃끼리의 시간계산
            for (int i = 0; i < records.length; i++) {
                String[] re = records[i].split(" ");
                String[] time = re[0].split(":");
                int totaltime = Integer.parseInt(time[0])*60+Integer.parseInt(time[1]);
                //System.out.println(totaltime+"전시간은"+Integer.parseInt(time[0])+"와"+Integer.parseInt(time[1]));

                if(carnumber[Integer.parseInt(re[1])] == 0){
                    count++;
                }
                carnumber[Integer.parseInt(re[1])]++;//자동차 번호 등록
                if(re[2].equals("IN")){//자동차 이용시간은 다알겠죠?
                    cartime[Integer.parseInt(re[1])]+=(-totaltime);
                }
                else{
                    cartime[Integer.parseInt(re[1])]+=totaltime;
                }
            }

            answer= new int[count];
            System.out.println("총 count"+count);
            int idx =0;
            for (int i = 0; i < cartime.length; i++) {
                if(cartime[i]<=0 && carnumber[i] >0){
                    cartime[i]+=23*60+59;
                    System.out.println("마지막에 안나갔음"+i);
                }
                if(carnumber[i] >0){
                    System.out.println("있던 시간"+cartime[i]);
                    System.out.println("차량 요금 계산"+checkfee(basetime,basefee,overtime,overfee,cartime[i]));
                    answer[idx] = checkfee(basetime,basefee,overtime,overfee,cartime[i]);
                    idx++;
                }
            }
            //만약에 출차가 되지않았다고 생각하면 23:59에 출차된걸로 생각해야되기때문에 -인경우는 23*60 +59 더해야됨


            return answer;
        }
        static int checkfee(int basetime, int basefee, int over,int overfee,int time){
            int upping;
            int fee;
            if(basetime>=time){
                upping =0;
            }
            else if((time-basetime)%over !=0){
                upping =(time-basetime)/over +1;
            }
            else{
                upping =(time-basetime)/over;
            }
            fee = basefee + upping*overfee;
            return fee;
        }
    }
}
