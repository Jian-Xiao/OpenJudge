import java.util.Scanner;

public class Q1 {
	static int monthDays[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] time1 = new int[3];
		int[] time2 = new int[3];
		for (int i = 0; i < 3; i++) {
			time1[i] = scanner.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			time2[i] = scanner.nextInt();
		}
		System.out.println(getTime(time2)-getTime(time1));
	}

	//get the days past from the first centrary
	public static int getTime(int[] time1) {
		int ans = 0;
		for (int i = 1; i < time1[0]; i++) {
			ans += 365;
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				ans += 1;
			}
		}
		for (int i = 1; i < time1[1]; i++) {
			ans += monthDays[i];
			if(i==2&&(time1[0] % 4 == 0 && time1[0] % 100 != 0 || time1[0]% 400 == 0)){
				ans+=1;
			}
		}
		ans+=time1[2];
		
		return ans;
	}
}
