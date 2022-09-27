package Sept_27;

import java.util.HashSet;
import java.util.Set;

public class hasSet {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();

        a.add(5);
        System.out.println(a);

        a.add(7);
        System.out.println(a);

        a.add(5);
        System.out.println(a);

        a.add(8);
        System.out.println(a);

        a.add(2);
        System.out.println(a);

        a.remove(7);
        System.out.println(a);

        System.out.println(a.size());

        /*
            해시셋은 중복된 원소를 허용하지 않는 성질은 가진 클래스이며, 순서에 구애받지 않습니다.
            5가 삽입되었을때 중복이 되므러 추가되지 않는것이 포인트입니다.
         */
    }
}
