package Programmers.Lv_2;

import java.util.Scanner;

public class MaximumMinimum {

    public String solution(String s) {
        String answer = "";

        String[] s1 = s.split(" ");

        int min = Integer.parseInt(s1[0]);
        int max = Integer.parseInt(s1[0]);

        for (String s2 : s1) {
            int i = Integer.parseInt(s2);
            if(min > i) min = i;
            if (max < i) max = i;
        }
        answer = min+" "+max;

        return answer;
    }

    public static void main(String[] args){
        MaximumMinimum T = new MaximumMinimum();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}
