package Programmers.Lv_1;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WorkInThePark {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        int x = park[0].length();
        int y = park.length;

        System.out.println(x);
        System.out.println(y);
        // park 를 이차원 배열에 넣기
        char[][] arr = new char[y][x];

        for(int i = 0; i < y; i++){
            arr[i] = park[i].toCharArray();

            if(park[i].contains("S")){
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
            }
        }

        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }

        // routes 를 읽기
        for(int i = 0; i < routes.length; i++){
            char s = routes[i].charAt(0);
            int n = routes[i].charAt(2) - '0';

            answer = walk(answer, s, n, arr, y, x);
        }

        return answer;
    }

    public int[] walk(int[] result, char s, int n, char[][] arr, int y, int x){
        int n1 = result[0];
        int n2 = result[1];

        for(int i = 0; i < n; i++){
            switch (s){
                case 'E':
                    n2++;
                    break;
                case 'W':
                    n2--;
                    break;
                case 'N':
                    n1--;
                    break;
                case 'S':
                    n1++;
                    break;
            }

            if(y > n1 && x > n2 && (n1 >= 0 && n2 >= 0)) {
                if(arr[n1][n2] == 'X'){
                    break;
                }

                if (i == n-1) {
                    result[0] = n1;
                    result[1] = n2;
                }
            }
        }


        return result;
    }

    public static void main(String[] args){
        WorkInThePark T = new WorkInThePark();

        //InputStreamReader rs = new InputStreamReader(System.in);
        //OutputStreamWriter wr = new OutputStreamWriter(System.out);

        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] park1 = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};
        String[] routes1 = {"E 2","S 2","W 1"};


        System.out.print(Arrays.toString(T.solution(park1, routes1)));
    }
}
