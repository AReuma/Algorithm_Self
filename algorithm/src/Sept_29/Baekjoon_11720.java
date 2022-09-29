package Sept_29;

import java.util.Scanner;

public class Baekjoon_11720 {
    public static void main(String[] args) {
        // 입력
        // 1. 숫자 갯수
        // 2. 숫자

        int count, sum = 0;
        Scanner scanner = new Scanner(System.in);

        count = scanner.nextInt();
        String num = scanner.next();

        for (int i = 0; i < count; i++){
            sum += num.charAt(i)-'0';
        }

        System.out.println(sum);
    }
}
