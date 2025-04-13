class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        // StringBuilder sb = new StringBuilder();
        
        for (String temp : babbling) {
            String findWord = temp;

            for (String word : words) {
                // System.out.println("findWord = " + findWord);
                findWord = findWord.replaceAll(word, " ");
                // System.out.println("after findWord = " + findWord);
            }

            // 같은 발음은 사용할 수 없다(추가 조건 필요함)
            if(findWord.trim().isEmpty() && isDuplicate(temp, words)){
                System.out.print("changeWord = " + findWord);
                System.out.println(", word = " + temp);
                answer++;
            }
        }
        
        return answer;
    }
    
    public static boolean isDuplicate(String word, String[] words) {
        for (String str : words) {
            if (word.contains(str + str)) {
                return false; 
            }
        }
        return true; 
    }
}