import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        LinkedHashSet <Integer> hs = new LinkedHashSet <>();
        
        for(int i=0; i<numbers.length-1; i++){
            int num1 = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                int num2 = numbers[j];
                int sum = num1 + num2;
                // System.out.println("num1 = " + num1 + " num2 = " + num2);
                hs.add(sum);
            }
        }
        // System.out.println(hs);
        List<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

// 0 2 5 7