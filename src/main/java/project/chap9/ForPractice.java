package project.chap9;

public class ForPractice {
	public static void printStarsHalfRibbon(int n) {
		for (int i = n; i > 0; i--) {
			printStarsLine(n - i, i);
		}
		for (int i = 1; i <= n; i++) {
			printStarsLine(n - i, i);
		}
	}
	
	public static void printStarsRibbon(int n) {
		for (int i = n; i > 0; i--) {
			printStarsLine(n - i, 2 * i - 1);
		}
		for (int i = 1; i <= n; i++) {
			printStarsLine(n - i, 2 * i - 1);
		}
	}
	
	// auxiliary function
	private static void printStarsLine(int spaces, int asterisks) {
		for (int i = 0; i < spaces; i++) {
			System.out.print(" ");
		}
		for (int i = 0; i < asterisks; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}
