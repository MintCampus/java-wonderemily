package project;

import project.chap9.*;
import project.chap10.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		testBreakPractice();
	}
	
	private static void testBreakPractice() {
		// System.out.println("[getSomeInputs] enter three numbers whose sum is divided by 5");
		// BreakPractice.getSomeInputs();
		// System.out.println("[getPrimeInput] enter prime number");
		// BreakPractice.getPrimeInput();
		BreakPractice.sumAll();
	}
	
	private static void testTernaryPractice() {
		TernaryPractice.printMax(1, 10);   // expect 10
		TernaryPractice.printMax(32, -32);  // expect 32
		TernaryPractice.printDiff(22, 21);  // expect 1
		TernaryPractice.printDiff(-3, -4);  // expect 1
		TernaryPractice.printMagicMax(11, 100);  // expect 11
		TernaryPractice.printMagicMax(333, 44);  // expect 44
		TernaryPractice.printMagicMax(555, 565);  // expect 565
	}
}
