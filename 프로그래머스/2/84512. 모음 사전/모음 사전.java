class Solution {
    /*
    @param word ['A', 'E', 'I', 'O', 'U']으로만 이루어진 배열
    return 사전에서 몇 번째 단어인지
    */
    int answer = 0;
    int cnt = 0;
    boolean isMatch = false;
    public int solution(String word) {
        
        dfs("", word);

        
        return answer;
    }
    
    
    private void dfs(String current, String target) {
        if (isMatch) return; // 찾은 경우 중지
        if (current.length() > 5) return; // 최대 길이 초과 시 중지

        if (!current.equals("")) cnt++;

        if (current.equals(target)) {
            answer = cnt;
            isMatch = true;
            return;
        }

        for (char c : new char[]{'A', 'E', 'I', 'O', 'U'}) {
            dfs(current + c, target);
        }
    }
}

// 'A', 'E', 'I', 'O', 'U'만을 사용하여 만들 수 있는, 길이 5 이하의 사전