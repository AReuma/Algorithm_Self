package Sept_27;

public class increaseTest2 {
    public static void main(String[] args) {
        int a = 5, b = 9, c;

        c = b % 5 < 5 ? 1 : 0; // c = 1
        System.out.println(c);
        // 0001 // 1000
        System.out.println(c|c);
        System.out.println(1 << 3);
        // 0001 -> 1000 -> 8
        System.out.println(8 | 1);
        c = c | c << 3; // 0001 -> 1000(2) -> 8
        // 0001
        // 1000
        // 1001 -> 1 + 8 => 9

        System.out.println(c);
        c = a < 5 || c >= 10 ? c - a : c + a; // 0 || 1 ?

        System.out.println(c); // 95

        // 비트 연산자 정리하기
        // 연산자 우선순위 공부하기
    }
}
