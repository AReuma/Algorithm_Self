package Baekjoon;

import java.util.Scanner;

public class Baekjoon_10988 {
    public int solution(String str){
        StringBuilder answer = new StringBuilder(str).reverse();

        if(str.equals(answer.toString())) return 1;
        else return 0;

    }

    public static void main(String[] args){
        Baekjoon_10988 T = new Baekjoon_10988();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
