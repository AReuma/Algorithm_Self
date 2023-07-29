package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_2490_1 {
    public static void main(String[] args) throws IOException {
        String[] arr =  {"D", "C", "B", "A", "E"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;

            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }

            sb.append(arr[sum]).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}
