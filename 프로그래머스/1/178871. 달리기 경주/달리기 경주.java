import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {        
        String[] answer = new String [players.length];
        List<String> copyPlayers = new ArrayList<>(Arrays.asList(players));
        Map<String, Integer> map = new HashMap<>(); // key 선수이름, value 순위
        for(int i =0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        
        for(String player : callings){
            // int currentRank= copyPlayers.indexOf(player); 시간 복잡도(n)
            int currentRank = map.get(player); // 시간 복잡도(1)
            String player1 = copyPlayers.get(currentRank); // 추월한 선수
            String player2 = copyPlayers.get(currentRank - 1); // 추월 당한 선수
            
            copyPlayers.set(currentRank-1, player1);
            copyPlayers.set(currentRank, player2);
            
            map.put(player1, currentRank - 1); 
            map.put(player2, currentRank);
            // break;
        }
        // System.out.println(copyPlayers);
        answer = copyPlayers.toArray(answer);

        return answer;
    }
}