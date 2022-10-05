package Oct_4;

public class Bit {
    public static void main(String[] args) {
        int decimal = 9;
        String binary = Integer.toBinaryString(decimal);
        String hexaDecimal =Integer.toHexString(decimal);
        System.out.println("DEC: " + decimal);
        System.out.println("HEX: " + hexaDecimal);
        System.out.println("BIN: " + binary);

        //String hexa = Integer.toBinaryString(8);
        // 배열안에 전부다 1을 넣고 and 연산으로 확인

        int[] a = new int[binary.length()];
        int[] b = new int[binary.length()];

        for (int i = 0; i < binary.length(); i++){
            b[i] = binary.charAt(i) & 1;

            if(b[i] == 1){
                System.out.println("참");
            } else
                System.out.println("거짓");
        }


        System.out.println(9 >> 3);
    }
}
