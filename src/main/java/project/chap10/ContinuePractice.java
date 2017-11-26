package project.chap10;

import java.util.Scanner;


public class ContinuePractice {
    public static int sumExceptMultiples() {
        int sum = 0;
        for (int i = 1; i<= 100; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                continue;
            }
            sum += i;
        }
        return sum;
    }
    
    public static void printExceptLastDigitEight() {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 8) {
                continue;
            }
            System.out.println(i);
        }
    }
    
    public static void printLowerCase() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        while (count < 10) {
            char ch = scanner.next().charAt(0);
            if ('a' <= ch && ch <= 'z') { // lowercase
                System.out.println(ch);
                count++;
            }
        }
    }
}
