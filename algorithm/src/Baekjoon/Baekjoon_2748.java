package Baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if(n == 0) System.out.println(0);
        else if (n == 1) System.out.println(1);
        else {
           BigInteger[] fibonacci = new BigInteger[n+1];
           fibonacci[0] = new BigInteger("0");
           fibonacci[1] = new BigInteger("1");

            for(int i = 2; i <= n; i++){
                fibonacci[i] = fibonacci[i-1].add(fibonacci[i-2]);
            }

            System.out.println(fibonacci[n]);
        }



    }
}
