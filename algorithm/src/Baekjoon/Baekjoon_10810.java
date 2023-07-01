package Baekjoon;

import java.util.Scanner;

public class Baekjoon_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] answer = new int[N];

        for(int i = 0; i < M; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K = sc.nextInt();

            for(int j = I -1; j < J; j++){
                answer[j] = K;
            }
        }

        for (int i : answer){
            System.out.print(i+" ");
        }
    }
}
