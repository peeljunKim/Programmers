import java.util.*;

class Solution {
    /*
    @param storey 엘리베이터가 있는 층(10의 지수)
    return 0층으로 가기 위한 필요한 마법의 돌 최소값
    */
    public int solution(int storey) {
        int answer = 0;
        
        while (storey > 0) {
            int digit = storey % 10; // 1의 자리 표현
            storey /= 10; 

            // 가까운 10의 배수로 만들면 엘리베이터 이동을 최소로 할 수 있음
            if (digit > 5) { // 자릿수가 6, 7, 8, 9인 경우:
                
                answer += (10 - digit);
                storey++; 
            } else if (digit < 5) { // 자릿수가 1, 2, 3, 4인 경우
                answer += digit;
            } else { // digit == 5인 경우
                if (storey % 10 >= 5) { // 다음 자릿수가 5 이상인 경우
                    answer += 5;
                    storey++; 
                } else { // 다음 자릿수가 5 미만인 경우
                    answer += 5;
                }
            }
        }
        return answer;
    }
}

// 현재 층 수에 버튼에 적혀 있는 값을 더한 층으로 이동
// 현재 층과 버튼의 값을 더한 결과가 0보다 작으면 엘리베이터 움직이지 않음