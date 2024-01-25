package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_2503 {
    public int solution(int count, int[][] input){
        int answer = 0;
        for(int i = 1; i <= 9; i++){    // 100
            for(int j = 1; j <= 9; j++){    // 10
                for(int k = 1; k <= 9; k++){ // 1
                    if(i == j || j == k || k == i) continue;

                    int cnt = 0;
                    for(int c = 0; c < count; c++){
                        int check = input[c][0];
                        int strike = input[c][1];
                        int ball = input[c][2];

                        int bCount = 0;
                        int sCount = 0;

                        int aaa = check / 100;
                        int aa = (check % 100) /10;
                        int a = (check % 100) %10;

                        if (aaa == i){
                            sCount ++;
                        }else if (aaa == j || aaa == k){
                            bCount ++;
                        }

                        if (aa == j){
                            sCount ++;
                        }else if (aa == i || aa == k){
                            bCount++;
                        }

                        if(a == k){
                            sCount++;
                        }else if (a == i || a == j){
                            bCount++;
                        }


                        if (!(sCount == strike && bCount == ball)){
                            break;
                        }else {
                            cnt++;
                        }

                    }

                    if (cnt == count){
                        answer ++;
                    }

                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Baekjoon_2503 T = new Baekjoon_2503();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[][] input = new int[count][3];

        for(int i = 0; i < count; i++){

            StringTokenizer sToken = new StringTokenizer(br.readLine());
            input[i][0] = Integer.parseInt(sToken.nextToken());
            input[i][1] = Integer.parseInt(sToken.nextToken());
            input[i][2] = Integer.parseInt(sToken.nextToken());
        }

        System.out.print(T.solution(count, input));
    }
}
