import java.util.*;
class Solution {
    /**
    @param k 번 신고하면 정지
    @param id_list 전체 유저 목록
    @param report 신고한 사람, 신고 당한 사람
    **/
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int [id_list.length];
        // key 신고한 유저, value 신고 당한 유저
        Map<String, Set<String>> reportMap = new HashMap<>();
        
        // key 신고 당한 유저 value 신고 당한 횟수
        Map<String, Integer> reportCntMap = new HashMap<>();
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            reportCntMap.put(id, 0);
        }
        
        for (String str : report) {
            String[] parts = str.split(" ");
            String reportIdA = parts[0]; // 신고한 사람
            String reportIdB = parts[1]; // 신고 당한 사람

            // 처음 신고하는 경우
            if (reportMap.get(reportIdA).add(reportIdB)) {
                reportCntMap.put(reportIdB, reportCntMap.get(reportIdB) + 1);
            }
        }
        
        // 이용 정지 사용자
        Set<String> blackList = new HashSet<>();
        for (String id : id_list) {
            if (reportCntMap.get(id) >= k) {
                blackList.add(id);
            }
        }
        
        for (int i = 0; i < id_list.length; i++) {
            String userId = id_list[i];
            Set<String> reportedByThisUser = reportMap.get(userId); // 신고한 목록
            int cnt = 0; // 신고 횟수
            for (String reportedId : reportedByThisUser) {
                if (blackList.contains(reportedId)) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
}

// 다른 유저들 신고 가능
// 한 유저 여러 번 신고 가능하지만, 1회로 처리

// 