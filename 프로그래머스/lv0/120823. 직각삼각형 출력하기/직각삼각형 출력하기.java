import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = "*";
			for (int j = -1; j < i; j++) {
				System.out.print(str);
			}
			System.out.println();
		}

	}

}