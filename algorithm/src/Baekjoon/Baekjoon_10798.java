package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10798 {
    public static int size = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strA = new String[size + 1];

        for(int i = 0; i < size; i++){
            strA[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 15; i++){
            for(int j = 0; j < size; j++){
                if(strA[j].length() > i) sb.append(strA[j].charAt(i));
            }
        }

        System.out.println(sb);
    }
}
