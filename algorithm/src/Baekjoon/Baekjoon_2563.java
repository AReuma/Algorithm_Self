package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_2563 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = 0;

        boolean[][] boolArr = new boolean[101][101];

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++){
                    if(!boolArr[j][k]){
                        boolArr[j][k] = true;
                        total ++;
                    }
                }
            }
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
    }
}
