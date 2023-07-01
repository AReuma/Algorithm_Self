package Baekjoon;

import java.util.Scanner;

public class Baekjoon_27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();

        System.out.println(str.charAt(n-1));
    }
}
