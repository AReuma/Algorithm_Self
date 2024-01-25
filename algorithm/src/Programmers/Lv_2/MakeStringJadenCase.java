package Programmers.Lv_2;

import java.util.Scanner;

public class MakeStringJadenCase {
    public String solution(String s) { // a = 97 // A = 65
        StringBuilder answer = new StringBuilder();
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' '){
                if(i+1 < charArray.length && charArray[i+1] != ' '){ // 공백 다음이 공백이 아닐경우
                    String s1 = charArray[i + 1] + "";
                    charArray[i+1] = s1.toUpperCase().charAt(0);
                    i++;
                }
            }else {
                if(i == 0){
                    String s1 = charArray[i] + "";
                    charArray[i] = s1.toUpperCase().charAt(0);
                }else {
                    String s1 = charArray[i] + "";
                    charArray[i] = s1.toLowerCase().charAt(0);
                }
            }
        }

        for (char c : charArray) {
            answer.append(c);
        }
        return answer.toString();
    }

    public static void main(String[] args){
        MakeStringJadenCase T = new MakeStringJadenCase();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}
