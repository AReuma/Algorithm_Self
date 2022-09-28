package Sept_27;

public class increaseTest {
    public static void main(String[] args) {
        int a = 12, b = 5, sum = 2;

        b *= a /= 4;

        System.out.println(b); // 15
        System.out.println(a);// 3

        sum += ++a * b-- / 4; // 4 * 15 / 4
        System.out.println(sum); // 17
    }
}
