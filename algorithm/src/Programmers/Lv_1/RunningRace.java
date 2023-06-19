package Programmers.Lv_1;

import java.util.Arrays;
import java.util.HashMap;

public class RunningRace {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        HashMap<String, Integer> rankName = new HashMap<>();
        HashMap<Integer, String> rankNum = new HashMap<>();

        for(int i = 0; i < players.length; i++){
            //System.out.println(players[i]);
            rankNum.put(i, players[i]);
            rankName.put(players[i], i);
        }

        for(String c : callings){
            int num = rankName.get(c); // 이름 불린 사람의 번호
            String mem = rankNum.get(num-1);

            rankName.put(c, num-1);
            rankName.put(mem, num);

            rankNum.put(num-1, c);
            rankNum.put(num, mem);

        }
        //System.out.println(rankName.keySet());
        for(int i = 0; i < players.length; i++){
            answer[i] = rankNum.get(i);
            //System.out.println(rankNum.get(i));
        }
        return answer;
    }

    public String[] solutions2(String[] players, String[] callings) { //틀리지는 않았지만 속도가 느린답.
        String[] answer = new String[players.length];

        for(String c : callings){
            int tmp = 0;
            // 자기 이름이 불릴경우 앞이랑 자리를 바꿈.
            for(String p : players){
                if(c.equals(p)){
                    String str = players[tmp -1]; // 앞선 친구
                    players[tmp -1] = p;
                    players[tmp] = str;
                }
                tmp ++;
            }
        }
        System.arraycopy(players, 0, answer, 0, players.length);

        return answer;
    }

    public static void main(String[] args){
        RunningRace T = new RunningRace();

        String[] pl = { "mumu", "soe", "poe", "kai", "mine" };
        String[] call = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(T.solution(pl, call)));
    }
}
