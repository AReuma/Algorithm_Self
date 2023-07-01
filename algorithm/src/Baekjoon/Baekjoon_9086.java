package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String[] strA = new String[T];

       for(int i = 0; i < T; i++){
           strA[i] = br.readLine();
       }

       for (String s : strA){
           //bw.write("=====");
           bw.write(s.charAt(0)+""+s.charAt(s.length()-1)+"\n");
       }

        br.close();
        bw.flush();
        bw.close();

        //System.out.println(st.nextToken());
    }
}
