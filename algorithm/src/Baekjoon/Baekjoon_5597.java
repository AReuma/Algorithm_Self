package Baekjoon;

import java.util.Scanner;


public class Baekjoon_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[30];
        int stu = 28;

        for(int i = 0; i < stu; i++){
            int n = sc.nextInt();
            num[n-1] = 1;
        }

        //System.out.println("======");
        for(int i = 0; i < num.length; i++){
            if(0 == num[i]){
                System.out.println(i+1);
            }
        }
    }
}
