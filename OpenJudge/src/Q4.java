import java.util.Scanner;


public class Q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int base= scanner.nextInt();
		int index=scanner.nextInt();
		int primeNumber= scanner.nextInt();
		System.out.println(calculate(base, index, primeNumber));
	}
	private static int calculate(int base,int index,int p) {
		int ans=1;
		while(index>0) {
			if((index&1)==0) {
				ans=(base*ans)%p;
			}
			base=(base*base)%p;
			index=index>>1;
		}
		return ans;
	}
}
