package Baekjoon;

import java.io.*;

public class Baekjoon_2558 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());

        bw.write(n1+n2+" ");
        bw.flush();
        bw.close();
    }
}
