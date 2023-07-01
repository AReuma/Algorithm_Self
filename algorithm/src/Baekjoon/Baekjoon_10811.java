package Baekjoon;

import java.util.Scanner;

public class Baekjoon_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] answer = new int[N];

        for(int i = 0; i < N; i++){
            answer[i] = i+1;
        }

        for(int i = 0; i < M; i++){
            int I = sc.nextInt(); // 1 // 0 인덱스
            int J = sc.nextInt(); // 2 // 1 인덱스

            int[] T = new int[J-I+1];
                // 1                // 0
            for(int j = J-1, k = 0; j >= I-1; j--, k++){
                T[k] = answer[j];
            }

            for(int k = I-1, j = 0; k <= J-1; j++, k++ ){
                answer[k] = T[j];
            }
        }

        for(int i : answer){
            System.out.print(i+" ");
        }


    }
}
