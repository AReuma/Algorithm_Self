package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon_9012 {
    public String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            answer = "YES";

            char c1 = str.charAt(i);

            if(c1 == '('){
                stack.push('(');
            }else if(stack.empty()){
                answer = "NO";
                break;
            }else {
                stack.pop();
            }
        }

        if (!stack.empty()) answer = "NO";

        return answer;
    }

    public static void main(String[] args){
        Baekjoon_9012 T = new Baekjoon_9012();
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String checkText = sc.next();

            System.out.println(T.solution(checkText));
        }
    }
}
