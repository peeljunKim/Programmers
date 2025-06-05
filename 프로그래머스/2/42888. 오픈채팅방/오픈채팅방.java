import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();// key 고유 번호, value 닉넴?, 상태?
        for(String str : record){
            String [] commands = str.split(" ");
            String command = commands[0];
            String id = commands[1];
            
            if(command.equals("Enter") || command.equals("Change")){
                String nickname = commands[2];
                map.put(id, nickname); // 닉네임 변경이 여기서 해결됨
            }
        }
        // System.out.println(map);
        
        List<String> list = new ArrayList<>(); // 메세지 담을 리스트
        
        for(String str : record){
            String [] commands = str.split(" ");
            String command = commands[0];
            String id = commands[1];
            
            String findNickname = map.get(id);
            // StringBuilder sb = new StringBuilder(); 채팅창 내역을 저장해야 됨
            if(command.equals("Enter")){
                list.add(findNickname + "님이 들어왔습니다.");
                // sb.append(findNickname+"님이 들어왔습니다.");
            }else if(command.equals("Leave")){
                list.add(findNickname + "님이 나갔습니다.");
                // sb.append(findNickname + "님이 나갔습니다.");  
            }
        }
        
        String[] answer = new String[list.size()]; // 배열의 길이 enter, leave의 갯수
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

/*
닉네임 변경 방법
1. 채팅방 나간 후 다시 입장
2. 채팅방에서 닉네임 변경

Muzi -> Prodo로 닉네임 변경후 채팅방 다시 입장
"Muzi님이 들어왔습니다."     "Prodo님이 들어왔습니다."
"Prodo님이 들어왔습니다."    "Prodo님이 들어왔습니다."
"Muzi님이 나갔습니다."      "Prodo님이 나갔습니다."
                          "Prodo님이 들어왔습니다."
                            
결론: 닉네임이 변경되면 한 유저의 기록도 같이 변경됨 == 유저마다 고유번호 있음
*/