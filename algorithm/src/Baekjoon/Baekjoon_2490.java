package Baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_2490 {
    public String solution(int[] arr){
        int z = 0;

        for(int i = 0; i < 4; i++){
            if(arr[i] == 0) z++;
        }

        return switch (z) {
            case 1 -> "A";
            case 2 -> "B";
            case 3 -> "C";
            case 4 -> "D";
            default -> "E";
        };
    }

    public static void main(String[] args) throws IOException {
        Baekjoon_2490 T = new Baekjoon_2490();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[3][4];

        for(int i = 0; i < 3; i++){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            for(int j = 0; j < 4; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int[] a : arr) {
            bw.write(T.solution(a)+"\n");
        }
        bw.close();
    }
}
