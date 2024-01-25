package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_19532 {
    public String solution(int a, int b, int c, int d, int e, int f){
        StringBuilder answer = new StringBuilder();
        /*for(int i = -999; i <= 999; i++){
            for(int j = -999; j <= 999; j++){
                if ((a * i) + (b * j) == c){
                    if((d * i) +( e * j )== f){
                        answer.append(i).append(" ").append(j);
                    }
                }
            }
        }*/

        answer.append((c*e - b*f) / (a*e - b*d)).append(" ").append((c*d - f*a) / (b*d - e*a));

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        Baekjoon_19532 T = new Baekjoon_19532();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer sToken = new StringTokenizer(br.readLine());
        br.close();

        int a = Integer.parseInt(sToken.nextToken());
        int b = Integer.parseInt(sToken.nextToken());
        int c = Integer.parseInt(sToken.nextToken());
        int d = Integer.parseInt(sToken.nextToken());
        int e = Integer.parseInt(sToken.nextToken());
        int f = Integer.parseInt(sToken.nextToken());

        bw.write(T.solution(a, b, c, d, e, f));
        bw.flush();
        bw.close();
    }
}
