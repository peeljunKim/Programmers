import java.util.HashMap;
class Solution {
    public String solution(String letter) {
        String answer = "";
		String[] arr = letter.split(" ");
		HashMap<String, Character> morseCodeMap = new HashMap<>() {
			{
				put(".-", 'a');
				put("-...", 'b');
				put("-.-.", 'c');
				put("-..", 'd');
				put(".", 'e');
				put("..-.", 'f');
				put("--.", 'g');
				put("....", 'h');
				put("..", 'i');
				put(".---", 'j');
				put("-.-", 'k');
				put(".-..", 'l');
				put("--", 'm');
				put("-.", 'n');
				put("---", 'o');
				put(".--.", 'p');
				put("--.-", 'q');
				put(".-.", 'r');
				put("...", 's');
				put("-", 't');
				put("..-", 'u');
				put("...-", 'v');
				put(".--", 'w');
				put("-..-", 'x');
				put("-.--", 'y');
				put("--..", 'z');
			}
		};

		for (String str : arr) {
			answer += morseCodeMap.get(str);
		}
		return answer;
    }
}