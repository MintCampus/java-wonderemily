package project.chap10;

import java.util.Scanner;


public class SwitchPractice {
    public static void printGrade(int num) {
        switch(num) {
        case 1:
        case 2:
        case 3:
            System.out.println("저학년");
            break;
        case 4:
        case 5:
        case 6:
            System.out.println("고학년");
            break;    
        }
    }
    
    public static void yesOrNo() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            char c = scanner.next().charAt(0);
            switch (c) {
            case 'y': 
            case 'Y':
                System.out.println("yes");
                return;
            case 'n':
            case 'N':
                System.out.println("no");
                return;
            }
        }
    }
}
