package Baekjoon;

import java.util.Scanner;

public class Baekjoon_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int answer = 0;

        for (String x : str.split(" ")){
            answer += Integer.parseInt(x);
        }

        System.out.println(answer);
    }
}
