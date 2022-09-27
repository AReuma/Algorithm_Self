package Sept_27;

public class forTest1 {
    public static void main(String[] args) {
        int i, j;

        for(i = 0, j =0; i <= 5; i++){
            j += i;
            System.out.print(i);
            if(i == 5){
                System.out.print("=");
                System.out.print(j);
            }else {
                System.out.print("+");
            }
        }

        for(int k = 0; k < 10; k++){
            System.out.println("k = "+k);
        }
    }
}
