import java.util.Scanner;

public class Baekjoon_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a * (b % 10));
		System.out.println(a * ((b % 100) / 10)); // (472 * ((385 % 100) / 10))
		System.out.println(a * (b / 100));
		System.out.println(a * b);
	}

}