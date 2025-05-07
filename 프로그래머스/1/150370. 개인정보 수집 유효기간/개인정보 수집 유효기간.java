import java.util.*;
import java.time.*;
import java.time.format.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        Map<String, String> map = new HashMap<>(); // 약관 종류(key) 및 기간(value)
        for(String str : terms){
            String[] arr = str.split(" ");
            map.put(arr[0], arr[1]);
        }

        LocalDate[] maxDatePersons = new LocalDate[privacies.length]; // 파기 날짜
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        
        for(int i=0; i< privacies.length; i++){
            String[] arr = privacies[i].split(" ");
            LocalDate date = LocalDate.parse(arr[0], formatter);
            String type = arr[1];
            LocalDate maxDate = date.plusMonths(Long.parseLong(map.get(type)));
            
            maxDatePersons[i] = maxDate;
            // System.out.println(maxDate);
            // System.out.println(map.get(type));
            // System.out.println("date = " + date +", type = " + type);
        }
        // System.out.println(Arrays.toString(maxDatePersons));
        
        LocalDate todayDate = LocalDate.parse(today, formatter);
        List<Integer> removePersonsIdx = new ArrayList<>(); // 파기할 사람들 번호
        for(int i=0; i < maxDatePersons.length; i++){
            if(todayDate.compareTo(maxDatePersons[i]) >= 0){
                removePersonsIdx.add(i + 1);
            }
        }
        
        int[] answer = removePersonsIdx.stream()
            .mapToInt(Integer :: intValue)
            .toArray();
        return answer;
    }
}

// 약관 종류 및 기간 terms 
//      1. 약관 종류 A ~ Z, 중복 x
//      2. 약관 기간 1~100
// 모든 달은 28일까지 있다고 가정