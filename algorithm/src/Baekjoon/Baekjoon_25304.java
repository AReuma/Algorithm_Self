package Baekjoon;

import java.util.Scanner;

public class Baekjoon_25304 {
    public String solution(int price, int[] pr, int[] count){
        String answer = "NO";
        int cal = 0;

        for(int i = 0; i < pr.length; i++){
            cal += (pr[i] * count[i]);
        }

        if(cal == price) answer = "YES";

        return answer;
    }

    public static void main(String[] args){
        Baekjoon_25304 T = new Baekjoon_25304();
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int num = sc.nextInt();
        int[] pr = new int[num];
        int[] count = new int[num];

        for(int i = 0; i < num; i++){
            pr[i] = sc.nextInt();
            count[i] = sc.nextInt();
        }

        System.out.print(T.solution(price, pr, count));
    }
}
