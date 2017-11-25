package project.chap10;

import java.util.Scanner;
import java.util.Random;

public class BreakPractice {

    public static void getSomeInputs() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            if ((a + b + c) % 5 == 0) {
                System.out.printf("a=%d, b=%d, c=%d\n", a, b, c);
                break;
            }
            else {
                System.out.println("Sum is not divided by 5 (remainder: " + ((a + b + c) % 5) + ")");
            }
        }
    }
    
    public static void getPrimeInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if (IfPractice.isPrime(a)) {
               System.out.println("소수입니다."); 
               break;
            }
            System.out.println("소수가 아닙니다.");
        }
    }
    
    public static void printMaxI() {
        int sum = 0;
        int i;

        for (i = 1; i <= 10000; i++) {
            sum += i;
            if (sum > 10000) {
                break;
            }
        }
        System.out.println(i);
    }
    
    // Example input: 10 20 30 1 2 3 6 5 4 -1
    // Example output: 81
    public static void sumAll() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int a = scanner.nextInt();
            if (a == -1) {
                break;
            }
            sum += a;
        }
        System.out.println(sum);
    }
}
