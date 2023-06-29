import java.util.Scanner;
public class CodeTest {

	public static void main(String[] args) { // 소문자 97 - 122 대문자 65 - 90
		Scanner sc = new Scanner(System.in);
		String inputString = " ";
		String outputString = "";
		String result = "";

		inputString = sc.next();

		char[] change = inputString.toCharArray();

		for (int i = 0; i < change.length; i++) {

			if (change[i] <= 122 && change[i] >= 97) {
				result = change[i] + "";
				String str1 = result.toUpperCase();
				outputString += str1;
			} else if (change[i] <= 90 && change[i] >= 65) {
				result = change[i] + "";
				String str2 = result.toLowerCase();
				outputString += str2;
			}

		}
		System.out.println(outputString);

	}

}