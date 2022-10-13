package Oct_5;

import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String[] arry = {"1111", "a123", "1234", "adf"};

        String pattern = "\\d\\d\\d\\d";

        for (String s : arry) {
            boolean result = Pattern.matches(pattern, s);

            if (result) {
                System.out.println("숫자");
            } else {
                System.out.println("문자");
            }
        }
        // 정규 표현식 -> 패턴을 찾겠다.

        // 형식:  /슬래쉬 패턴 /슬래쉬 플래그

        // 플래그 종류
        // 1) g: 매칭되는 다수의 결과값을 기억
        // 2) m: multi line 사용하면 여러줄로 구분.
        // 3) i: 대소문자 구분 안함




        // =======
        // 1. Groups and ranges
        // | 또는
        // () 그룹
        //(?:) 찾지만 기억하지 않음, 그룹을 설정하지 않음.
        // [] 집합체, 문자셋, 괄호안이 어떤 문자든.
        // [^] 집합체 안에 있는건 제외하고 찾는다.

        // 2. Quantifiers
        //

        // boundary-type

        //


    }
}
