package project.chap12;

public class Recursive {
    public static int sum(int n) {
        if (n > 1) {
            return n + sum(n - 1);
        }
        else return 1;
    }
    
    public static long fibonacci(int n) {
        if (n >= 3) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        else return 1;
    }
    
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
    
    public static void factorize(int n) {
        factorizeRecursive(n, 2, true);
    }
    
    public static void factorizeRecursive(int n, int lastDivisor, boolean isFirst) {
        if (n == 1) return;
        for (int d = lastDivisor; d <= n; d++) {
            if (n % d == 0) {
                if (!isFirst) System.out.print("x");
                System.out.print(d);
                factorizeRecursive(n / d, d, false);
                return;
            }
        }
    }
}