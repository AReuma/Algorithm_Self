package Programmers.Lv_2;

import java.util.*;

public class MakeMinimum {
    public int solution(int[] A, int[] B){
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        //Integer[] arr = Arrays.stream(B).boxed().toArray(Integer[]::new);
        //Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length -1 -i];
        }

        return answer;
    }

    public static void main(String[] args){
        MakeMinimum T = new MakeMinimum();

        int[] A = {1, 2};
        int[] B = {3, 4};

        System.out.print(T.solution(A, B));
      }
}
