package project.chap9;

import java.util.Scanner;

public class WhilePractice {
	public static void prob1() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int i = 0;
        while (i < 3) {
            int j = 0;
            while (j < 10) {
	            System.out.print(a);
            	j++;
            }
            System.out.println("");
	        i++;
        }	
	}
	
	public static void prob2() {
		int i = 5;
		while (i >= 2) {
			int j = 9;
			while (j >= 1) {
				System.out.println(i + " × " + j + " = " + (i * j));
				j--;
			}
			System.out.println("");
			i--;
		}
	}

	public static void printStars(int rows, int stride) {
		int i = 0;
		while (i < rows) {
			int j = 0;
			while (j < (stride * i + 1)) {
				System.out.print("*");
				j++;
			}
			System.out.println("");	
			i++;
		}
	}
	
	public static void printStarsReversed(int rows, int stride) {
		int i = rows - 1;
		while (i >= 0) {
			int j = 0;
			while (j < (stride * i + 1)) {
				System.out.print("*");
				j++;
			}
			System.out.println("");	
			i--;
		}
	}
}
