package project.chap13;

public class ArrayPractice {
    public static void ex14_1() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = 100 - i;
        }
    }
    
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - i - 1];
        }
        return reversed;
    }
    
    public static void ex14_4() {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = 0;
            for (int k = 1; k <= i + 1; k++) {
                array[i] += k;
            }
        }
    }
}
