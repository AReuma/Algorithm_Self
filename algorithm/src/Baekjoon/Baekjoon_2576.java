package Baekjoon;

import java.io.*;

public class Baekjoon_2576 {
    public String solution(int[] arr){
        int sum = 0, min = Integer.MAX_VALUE;

        for(int i : arr){
            if(i % 2 != 0){
                sum += i;
                if(min > i) min = i;
            }
        }

        if(sum == 0) return "-1";
        else return sum+"\n"+min;

    }

    public static void main(String[] args) throws IOException {
        Baekjoon_2576 T = new Baekjoon_2576();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[7];

        for(int i = 0; i < 7; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        bw.write(T.solution(arr));
        bw.close();
    }
}
