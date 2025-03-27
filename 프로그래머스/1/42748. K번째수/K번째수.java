import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[commands.length];
        int temp = 0; // answer에 인덱스
        
        for(int[] arr : commands){
            int i = arr[0];
            int j = arr[1];
            int k = arr[2];
            int length = j - i + 1; // 단 j가 항상 높다는 가정
            
            for(int z = i; z<=j; z++){
                int idx = z -1;
                // array[idx];
                // if(z >= array.length){
                    // idx = z % array.length;
                    // list.add(array[idx]);
                // }else{
                    list.add(array[idx]);
                // }
            }
            Collections.sort(list);
            // System.out.println(list);
            // System.out.println(list.get(k-1));
            answer[temp] = list.get(k-1);
            temp++;
            list.clear();
        }
        
        
        
        return answer;
    }
}
// 단 i ~ j 범위가 array 인덱스를 넘어가면 ? % array.length해야 됨
// i = 시작 인덱스
// j = 마지막 인덱스
// i, j로 만든 배열을 오름차순으로 정렬
// k = i, j에서 나온 k번째 값