import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        StringBuffer sb = new StringBuffer();
        
        for(String spellStr : spell){
            sb.append(spellStr);
        }
        
        String spellStr = sb.toString();
        
        for (String word : dic) {    
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            // String wordStr = Arrays.toString(wordChars);;
            String wordStr = new String(wordChars);
            
            if (spellStr.equals(wordStr)) {
                return 1; 
            }
            System.out.println(wordStr);
        }
        System.out.println("spell = "+spellStr);
        
        
        return 2;
    }
}
