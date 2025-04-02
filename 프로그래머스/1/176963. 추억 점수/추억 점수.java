import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int [photo.length];
        HashMap<String, Integer> map = new HashMap<>();
        int sum = 0;
        
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int j=0; j<photo.length; j++){
            for(int k=0; k< photo[j].length; k++){
                for (String key : map.keySet()) {
                    if(photo[j][k].equals(key)){
                        sum += map.get(key);
                        // System.out.println("key = " + key + " value = "+map.get(key));
                    }
                    // System.out.println("Key: " + key);
                }
            }
            // System.out.println(sum);
            answer[j] = sum;
            sum = 0; // 합 초기화
        }
        
        // System.out.println(map);
        
        
        return answer;
    }
}
// 사진별로 점수 
// 그리워하는 사람의 이름을 담은 문자열 배열 name, 
// 각 사람별 그리움 점수를 담은 정수 배열 yearning, 
// 각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo가 매개변수로 주어질 때, 
// 사진들의 추억 점수를 photo
// 