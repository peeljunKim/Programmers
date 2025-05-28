import java.util.*;
class Solution {
    /*
    @param skill 선행 스킬 순서
    @param skill_trees 유저들이 만든 스킬트리 배열
    return 가능한 스킬트리 개수
    */
    public int solution(String skillSeq, String[] skill_trees) {
        int answer = 0;
        for(String skillTree : skill_trees){
            boolean isMatch = true;
            int idx = 0; // 선행 스킬 인덱스
            
            for(char skill : skillTree.toCharArray()){
                int CurrentSkillIdx = skillSeq.indexOf(skill); // 없으면 -1 반환
                
                // System.out.println("skill = " + skill + ", CurrentSkillIdx = " + CurrentSkillIdx);
                // 선행 스킬이 skill에 포함되는 경우
                if (CurrentSkillIdx != -1) { 
                    // 선행 스킬 순서 확인
                    if (CurrentSkillIdx == idx) {
                        idx++;
                    } else {
                        isMatch = false;
                        break; 
                    }
                }
            }
            
            if(isMatch) answer++;
            
        }
        
        return answer;
    }
    
    
}
// 매개변수 둘 다 중복 x
// 먼저 배워야 되는 스킬을 그냥 삭제?? -> 안됨