import java.util.*;
class Solution {
    
    static class Task {
        String name; // 과제 이름
        int start;   // 시작 시간 
        int playtime;  // 과제 수행 시간 

        Task(String name, int start, int playtime) {
            this.name = name;
            this.start = start;
            this.playtime = playtime;
        }
    }
    
    
    public String[] solution(String[][] plans) {
        
        int n = plans.length;

        List<Task> taskList = new ArrayList<>();
        for (String[] plan : plans) {
            String name = plan[0];
            int start = strToMinutes(plan[1]);
            int playTime = Integer.parseInt(plan[2]);
            taskList.add(new Task(name, start, playTime));
        }

        // 시작 시간 기준 오름차순 정렬
        taskList.sort(Comparator.comparingInt(t -> t.start));

        List<String> result = new ArrayList<>(); 
        Stack<Task> stack = new Stack<>(); // 중단된 과제 관리를 위한 스택

        // 0 ~ n-2번째 과제까지, 다음 과제 시작 전까지의 시간으로 처리
        for (int i = 0; i < n - 1; i++) {
            Task current = taskList.get(i);
            Task next = taskList.get(i + 1);

            int currentTime = current.start;          // 현재 과제 시작 시각
            int available = next.start - currentTime; // 다음 과제 시작까지의 여유 시간

            // 현재 과제를 먼저 수행
            if (current.playtime <= available) {
                // 현재 과제를 모두 끝낼 수 있는 경우
                available -= current.playtime;       // 남은 여유 시간 갱신
                result.add(current.name);          // 완료 순서에 기록

                // 남은 여유 시간 동안 스택에 쌓인 과제를 처리
                while (available > 0 && !stack.isEmpty()) {
                    Task paused = stack.pop();     // 가장 최근에 중단한 과제
                    if (paused.playtime <= available) {
                        available -= paused.playtime;
                        result.add(paused.name);
                    } else {
                        paused.playtime -= available;
                        available = 0;
                        stack.push(paused);
                    }
                }
            } else {
                // 현재 과제를 다 끝내지 못하고 일부만 수행해야 하는 경우
                current.playtime -= available; // 수행한 만큼 남은 시간 감소
                stack.push(current);         
            }
        }

        // 마지막 과제는 이후에 새로운 과제가 없으므로 끝까지 수행
        Task last = taskList.get(n - 1);
        result.add(last.name);

        // 스택에 남은 과제들을 가장 최근 것부터 순서대로 처리
        while (!stack.isEmpty()) {
            Task t = stack.pop();
            result.add(t.name);
        }

        return result.toArray(new String[0]);
    }
    
    
    
    public static int strToMinutes(String time) {
        String[] split = time.split(":");
        int hours = Integer.parseInt(split[0]);
        int mins = Integer.parseInt(split[1]);
        return hours * 60 + mins;
    }
}