package Sept_27;

public class TenToBinary {
    public static void main(String[] args) {
        // 10을 2진수로 변경
        int[] arr = new int[8];
        int num = 10, i = 0;

        while (num > 0){
            arr[i++] = num % 2;
            num /= 2;
        }

        for (int j = i-1; j >= 0; j--) {
            System.out.printf("%d", arr[j]);
        }
    }
}
