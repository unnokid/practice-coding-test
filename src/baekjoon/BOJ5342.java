package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ5342 {
    public static void main(String[] args) throws IOException {
        //백준 5342 Billing

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Double> map = new HashMap<>();
        map.put("Paper",57.99);
        map.put("Printer",120.50);
        map.put("Planners",31.25);
        map.put("Binders",22.50);
        map.put("Calendar",10.95);
        map.put("Notebooks",11.20);
        map.put("Ink",66.95);

        double result = 0;
        while(true){
            String s = br.readLine();
            if(s.equals("EOI")){
                break;
            }
            result+= map.get(s);
        }
        System.out.println("$"+result);
    }
}
