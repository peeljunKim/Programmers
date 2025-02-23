import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
 
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                list.add(i);
            }
        }
        
        // 
        list.sort(Comparator.comparingInt(i -> rank[i]));
            
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("c=" +c);
        return 10000 * a + 100 * b + c;
    }
}

// attendance = 참석 가능 여부
// 10000 × a + 100 × b + c

// 1번 2 4 3