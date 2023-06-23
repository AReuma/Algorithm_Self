package Programmers.Lv_1;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> nameNum = new HashMap<>();

        for(int i = 0; i < name.length; i++){
            nameNum.put(name[i], yearning[i]);
        }

        for(int i = 0; i < photo.length; i++){
            int num = 0;
            for(int j = 0; j < photo[i].length; j++){
                if(nameNum.get(photo[i][j]) != null) {
                    num += nameNum.get(photo[i][j]);
                }
            }
            answer[i] = num;
        }

        return answer;
    }
}

public class MemoryScore {
    // 그리워하는 사람의 이름 배열 name
    // 각 사람 별그리운 점수를 담은 정수 배열 yearning
    // 각 사진에 찍히 인물의 인물을 담은 이차원 문자열 배열 photo

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo= {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        //System.out.println(photo[0].length);

        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution(name, yearning, photo)));
    }
}
