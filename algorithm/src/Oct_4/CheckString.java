package Oct_4;

public class CheckString {
    public static void main(String[] args) {
        String arry[] = {"1111", "a123", "1234", "adf"};
        char check;

        for(int i = 0; i < arry.length; i++){
            boolean stringCheck = false;

            for(int j = 0; j < arry[i].length(); j++){
                check = arry[i].charAt(j);
                if(check < 48 || check > 58){
                    stringCheck = true;
                    break;
                }
            }

            if(stringCheck){
                System.out.println("문자");
            }else {
                System.out.println("숫자");
            }
        }
    }
}
