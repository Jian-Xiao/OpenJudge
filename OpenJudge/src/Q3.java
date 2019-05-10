import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strs = new String[scanner.nextInt()];
		scanner.nextLine();
		for (int i = 0; i < strs.length; i++) {
			strs[i] = scanner.nextLine();
			
		}
		for (int i = 0; i < strs.length; i++) {
			System.out.println(getMaxHUIWENG(strs[i]));
		}

	}

	public static String getMaxHUIWENG(String str) {
		int maxHead = -1;
		int maxEnd = 1;
		for (int i = 0; i < str.length(); i++) {
			int head = i - 1;
			int end = i + 1;
			//deal with examples like aaa
			while (end < str.length()&&str.charAt(i) == str.charAt(end))
				end++;
			//deal with examples like bacab
			while (head >= 0 && end < str.length()) {
				if (str.charAt(head) == str.charAt(end)) {
					head--;
					end++;
				} else {					
					break;
				}
			}
			if (maxEnd - maxHead < end - head) {
				maxEnd = end;
				maxHead = head;
			}
		}
		return str.substring(maxHead+1, maxEnd);
	}
}
