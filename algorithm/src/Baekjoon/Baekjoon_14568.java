package Baekjoon;

import java.util.Scanner;

public class Baekjoon_14568 {
    public int solution(int n){
        int answer = 0;

        for (int a = 0; a < n+1; a++) {
             for(int b = 0; b < n+1; b++){
                 for(int c = 0; c < n+1; c++){
                     if ((a + b + c) == n){
                         if (a >= 2+b){
                             if(a != 0 && b != 0 && c != 0){
                                 if(c % 2 == 0){
                                     answer++;
                                 }
                             }
                         }
                     }
                 }
             }

        }


        return answer;
    }

    public static void main(String[] args){
        Baekjoon_14568 T = new Baekjoon_14568();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(T.solution(n));
    }
}
