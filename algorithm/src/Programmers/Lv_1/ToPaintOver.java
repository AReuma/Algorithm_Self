package Programmers.Lv_1;

import java.util.Scanner;

public class ToPaintOver {
    public int solution(int n, int m, int[] section) {
        int maxPainted = 0, cntPaint = 0;

       for(int point : section){
           if(maxPainted <= point){
               maxPainted = point + m;
               cntPaint++;
           }
       }

        return cntPaint;
    }

    public static void main(String[] args){
        ToPaintOver T = new ToPaintOver();

        int n1 = 8;
        int n2 = 5;
        int n3 = 4;

        int m1 = 4;
        int m2 = 4;
        int m3 = 1;

        int[] arr1 = {2, 3, 6, 8};
        int[] arr2 = {1, 3};
        int[] arr3 = {1, 2, 3, 4};

        System.out.print(T.solution(n1, m1, arr1));
    }
}
