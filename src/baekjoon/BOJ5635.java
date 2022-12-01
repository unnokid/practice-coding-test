package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BOJ5635 {

    public static void main(String[] args) throws IOException {
        //백준 5635 생일


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();
        for (int i = 0; i <T ; i++) {
            String[] s = br.readLine().split(" ");
            Person person = new Person(s[0],Integer.parseInt(s[3]),Integer.parseInt(s[2]),Integer.parseInt(s[1]));
            list.add(person);
        }
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.year == o2.year){
                    if(o1.month ==o2.month){
                        if(o1.day==o2.day){
                            return 0;
                        }
                        return o1.day-o2.day;
                    }

                    return o1.month-o2.month;
                }
                return o1.year-o2.year;
            }
        });
        System.out.println(list.get(list.size()-1).name);
        System.out.println(list.get(0).name);
    }
    static class Person{
        String name;
        int year;
        int month;
        int day;

        public Person(String name, int year, int month, int day) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public String toString() {
            return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
        }
    }
}
