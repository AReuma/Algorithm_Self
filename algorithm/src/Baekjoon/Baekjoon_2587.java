package Baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2587 {

    public static void main(String[] args) throws IOException {
        Baekjoon_2587 T = new Baekjoon_2587();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        bw.write((sum/5) + "\n"+arr[2]);
        bw.close();
    }
}
