package Baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Baekjoon_2941 {
    public static void main(String[] args) throws IOException {
       String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        for (String s : arr) {

            str = str.replace(s, "A");

        }

        bw.write(String.valueOf(str.length()));
        bw.flush();
        bw.close();
    }
}
