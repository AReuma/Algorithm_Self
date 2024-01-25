package Programmers.Lv_2;

import java.util.Scanner;

public class MakeStringJadenCase_Answer {
    public String solution(String s) { // a = 97 // A = 65
        String answer = "";

        String[] sp = s.toLowerCase().split(""); // String의 toUpperCase 사용하기 위해서
        // 공백이 아니면 첫번째는 무조건 대문자
        boolean flag = true;

        for (String s1 : sp) {
            answer += flag ? s1.toUpperCase() : s1;
            flag = s1.equals(" ");
        }

        return answer;
    }

    public static void main(String[] args){
        MakeStringJadenCase_Answer T = new MakeStringJadenCase_Answer();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}
