import java.util.*;
class Solution {
    /**
    @param video_len 동영상의 길이
    @param pos 기능 수행 전 재생위치
    @param op_start 오프닝 시작 시간
    @param op_end 오프닝 끝나는 시간
    @param commands 사용자 입력
    **/
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

        int videoSec = StrToSecond(video_len);
        int currentSec = StrToSecond(pos);
        int opStartSec = StrToSecond(op_start);
        int opEndSec = StrToSecond(op_end);
        
        
        for (String command : commands) {

            // 오프닝 구간 자동 건너뛰기 기능 ★ 위치 중요 ★
            if (currentSec >= opStartSec && currentSec <= opEndSec) {
                currentSec = opEndSec; // 오프닝 끝 시각으로 이동
            }
            // 10초 전으로 이동
            if (command.equals("prev")) {
                currentSec = Math.max(0, currentSec - 10);
            // 10초 후로 이동
            } else if (command.equals("next")) {
                currentSec = Math.min(videoSec, currentSec + 10);
            }
            
            // 오프닝 구간 자동 건너뛰기 기능 ★ 위치 중요 ★
            if (currentSec >= opStartSec && currentSec <= opEndSec) {
                currentSec = opEndSec; // 오프닝 끝 시각으로 이동
            }
            System.out.println("현재 시간 = " + currentSec);

        }
        
        int minutes = currentSec / 60;
        int seconds = currentSec % 60;
        String answer = String.format("%02d:%02d", minutes, seconds);
        
        return answer;
    }
    // 시간으로 변환(String -> int)
    private int StrToSecond(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

}

// 기능 
// 1.10초 전 이동(prev) - 현재 위치가 10초 미만인 경우 0분0초로 이동 
// 2.10초 후 이동(next) - 영상 남은 시간이 10초 미만인 경우 영상 마지막 위치로 이동
// 3.오프닝 건너뛰기(재생 위치가 오프닝 구간인 경우 자동)