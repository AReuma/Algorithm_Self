package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * 메모리 초과 에러 발생
 * */
public class Baekjoon_1090 {
    public int[] solution(int[] xArr, int[] yArr, int count, int[] x, int[] y){
        int[] answer = new int[count];

        int i1 = xArr[(xArr.length - 1)] - xArr[0] + 1;
        int i2 = yArr[(xArr.length - 1)] - yArr[0] + 1;

        int[] xArray = Arrays.stream(xArr).distinct().toArray();
        int[] yArray = Arrays.stream(yArr).distinct().toArray();

        int[] xNum = new int[i1 * i2];
        int[] yNum = new int[i1 * i2];

        int[][] answerArr = new int[i1 * i2][xArr.length];

        int k = 0;
        for (int i = 0; i < xArray.length; i++) {
            for (int j = 0; j < yArray.length; j++) {
                xNum[k] = xArray[i];
                yNum[k] = yArray[j];
                k++;
            }
        }

        for (int i = 0; i < xNum.length; i++) {  // 9

            for(int j = 0; j < xArr.length; j++){ // 4
                int i3 = Math.abs(xNum[i] - x[j]);
                int i4 = Math.abs(yNum[i] - y[j]);

                int i5 = i3 + i4;
                answerArr[i][j] = i5;
            }
            Arrays.sort(answerArr[i]);
        }

// 1 2 3 4   ''''' 1
// 1 2 3 4   ''''' 2
// 1 2 3 4   ''''' 3
// 1 2 3 4   ''''' 4
// 1 2 3 4   ''''' 5

        /*for (int i = 0; i < answerArr.length; i++) {
            for(int j = 0; j < answerArr[i].length; j++){
                System.out.print(answerArr[i][j]+" ");
            }
            System.out.println(" ");
        }
*/

        for(int i = 0; i < count; i++){ // 4개의 답
            int min = 2147000000;

            for(int j = 0; j < answerArr.length; j++){ // 9개를 반복
                int result = 0;

                for(int l = 0; l <= i; l++){
                    result += answerArr[j][l];
                }

                if (min > result) {
                    min = result;
                    answer[i] = min;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Baekjoon_1090 T = new Baekjoon_1090();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] x = new int[n];
        int[] y = new int[n];
        int[] xArr = new int[n];
        int[] yArr = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int xP = Integer.parseInt(st.nextToken());
            int yP = Integer.parseInt(st.nextToken());

            x[i] = xP;
            y[i] = yP;
            xArr[i] = xP;
            yArr[i] = yP;
        }

        Arrays.sort(xArr);
        Arrays.sort(yArr);

        //System.out.print(Arrays.toString(T.solution(xArr, yArr, n, x, y)));
        for (int i : T.solution(xArr, yArr, n, x, y)) {
            bw.write(i+" ");
        }
        bw.flush();
        bw.close();
    }
}
