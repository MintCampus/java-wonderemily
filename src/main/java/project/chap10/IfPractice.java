package project.chap10;

public class IfPractice {

	public static void isDivisableByThree(int n) {
		if(n % 3 == 0) System.out.println("3의 배수");
	}
	
	/**
	 * 사용자가 한 자리 수를 입력했을 때, 1부터 500까지의 숫자들 중 일의 자리
	 * 수가 사용자가 입력한 수와 같은 수들의 합을 출력하는 함수
	 */ 
	public static void sumOfAllNumbersWithSameLastDigit(int n) {
		int sum = 0;
		for (int i = 1; i < 500; i++) {
			if (i % 10 == n)
				sum = sum + i;
		}
		System.out.println(sum);
	}
	
	/**
	 * 사용자가 100보다 큰 수를 입력했을 때, 100부터 사용자가 입력한 수까지의 
	 * 수들 중 4의 배수를 출력하는 함수
	 */
	public static void findAllMultipliersOfFourFrom(int n) {
		for (int i = 100; i <= n; i++) {
			if (i % 4 == 0) System.out.println(i);
		}
	}
	
	/**
	 * 1부터 100까지의 수 중 3의 배수이거나 7의 배수인 수들만을 출력하는 함수
	 */
	public static void findAllNumberWithDivisorThreeOrSeven(int n) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 7 == 0) System.out.println(i);
		}
	}
	
	public static void succeedOrFail(int score) {
		if (score >= 70) System.out.println("합격");
		else System.out.println("불합격");
	}
	
	public static void printEvenOdd() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) System.out.println("짝" + i);
			else System.out.println("홀" + i);
		}
	}
	
	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
  			if (n % i == 0) return false;
		}
		return true;
	}
	
	public static void testPrimes() {
		for (int i = 2; i <= 30; i++) {
			if (isPrime(i)) System.out.println(i + ": 소수");
			else System.out.println(i + ": 합성수");
		}
	}
}
