class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if(common[1] - common[0] == common[2] - common[1]){//등비수열
            answer = common[common.length-1] + (common[1] - common[0]);
        }else{
            answer = common[common.length-1] * (common[1] / common[0]);
        }
        return answer;
    }
}

// 등차, 등비인지 어떻게 구별할까요??
// 최소 길이가 3