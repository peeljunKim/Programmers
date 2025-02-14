import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = l; i<= r; i++){
            String cnvNmbToStr =  String.valueOf(i);
            String[] cnvNmbToStrs = cnvNmbToStr.split("");
            int cnt = 0;
            
                for (int j = 0; j < cnvNmbToStrs.length; j++) {
                    if (cnvNmbToStrs[j].equals("0") || 
                        cnvNmbToStrs[j].equals("5")) {
                        cnt++;
                    }
                }
                if(cnt == cnvNmbToStrs.length) {
                    list.add(i);
                }
        }
        int answerSize = 1; // 기본값
        int listSize = list.size();
        if(list.size() != 0){
            answerSize = list.size();
        } 
        
        int[] answer = new int[answerSize];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        if(answerSize == 1){
            answer[0] = -1;
        }
        
        return answer;
    }
}