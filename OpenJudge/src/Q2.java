import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a =scanner.nextInt();
		int b = scanner.nextInt();
		long t1 =System.nanoTime();
		for(;a<=b;a++) {
			if(judge(a)&&judge(reverse(a)))
				System.out.println(a);
		}
		System.out.println((System.nanoTime()-t1)/1000000);
	}
	
	private static boolean judge(int a) {
		if(a==3||a==2)
			return true;
		else if(a==1)
			return false;
		else if(a%6!=1&&a%6!=5)
			return false;
		for(int i =3;i<Math.sqrt(a);i+=2) {
			if(a%i==0) {
				return false;
			}			
		}
		return true;	
	}
	private static int reverse(int a) {
		int b=0;
		while(a>0) {
			b= a%10+b*10;
			a=a/10;
		}
		return b;	
	}
}
