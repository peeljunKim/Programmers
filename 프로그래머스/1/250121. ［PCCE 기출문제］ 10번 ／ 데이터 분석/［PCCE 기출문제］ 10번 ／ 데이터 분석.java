import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        Map<String, Integer> map = new HashMap<>(); // 어떤 데이터를 뽑을 지 결정
        List<int[]> list = new ArrayList<>();
        
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        int extNum = map.get(ext); // 데이터 뽑는 기준
        int sortByNum = map.get(sort_by); // 정렬 기준
        
        for(int[] item : data){
            if(item[extNum] < val_ext){ // data에서 ext 값이 val_ext보다 작은 데이터만 
                list.add(item);
            }
        }
        
        // for(int i = 0; i<list.size(); i++){
        //     System.out.println(Arrays.toString(list.get(i)));
        // }
        
        Collections.sort(list, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[sortByNum], b[sortByNum]);
            }
        });
        
        int[][] answer = new int[list.size()][data[0].length];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}



// 코드번호, 제조일, 최대 수량, 현재 수량으루 2차열 배열 구성(data)
// 어떤 데이터를 뽑을 지 ext 
// 기준값 val_ext(이거보다 작은 데이터)
// 정렬 기준 sort_by 예시, 코드, 제조일, 최대 수량, 현재 수량
