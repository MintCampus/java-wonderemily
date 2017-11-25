package project.chap10;

public class TernaryPractice {
    public static void printMax(int a, int b) {
        int max = (a > b) ? a : b;
        System.out.println(max);
    }
    
    public static void printDiff(int a, int b) {
        int diff = (a > b) ? a - b : b - a;
        System.out.println(diff);
    }
    
    public static void printMagicMax(int a, int b) {
        int answer = 
            (a % 10) > (b % 10) ? a : 
            (a % 10) == (b % 10) ? (a > b ? a : b) : 
            b;
        int answer2 =
            (a % 10) > (b % 10) ? a :
            (a % 10) < (b % 10) ? b :
            (a > b ? a : b);
        System.out.println(answer);
        System.out.println(answer2);
    }
}
