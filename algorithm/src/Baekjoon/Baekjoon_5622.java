package Baekjoon;

import java.util.Scanner;

public class Baekjoon_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strA = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int answer = 0;

        String str = sc.next();

        for(int i = 0; i < str.length(); i++){ // W, A
            for(int j = 0; j < strA.length; j++){
                for(int k = 0; k < strA[j].length(); k++){
                    if(strA[j].charAt(k) == str.charAt(i)){
                        //System.out.println(j+3);
                        answer += (j+3);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
