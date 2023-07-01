package Baekjoon;

import java.util.Scanner;

public class Baekjoon_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] answer = new int[N];

        for(int i = 0; i < N; i++){
            answer[i] = i+1;
        }

        for(int i = 0; i < M; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();
            int tmp = 0;

            tmp = answer[I-1];
            answer[I-1] = answer[J-1];
            answer[J-1] = tmp;
        }

        for (int i : answer){
            System.out.print(i+" ");
        }
    }
}
