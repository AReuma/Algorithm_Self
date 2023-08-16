package Baekjoon;

import java.io.*;

public class Baekjoon_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 1;
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++){
            sum = sum * i;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
