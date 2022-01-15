/**
 *  Java 1. HomeWork 1
 *
 * @author PrikhodchenkoDO
 * @version 12.01.2022
 */


package lesson01;
import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    static void checkSumSign() {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        a = sc.nextInt();
        System.out.println("b = ");
        b = sc.nextInt();
        System.out.println(((a + b) >= 0)? "Положительная" : "Отрицательная");
    }

    static void printColor() {

        Scanner sc = new Scanner(System.in);
            int value = 0;
            System.out.println("value = ");
            value = sc.nextInt();

            if ( value <= 0 ) {
                System.out.println("RED");
            }
            else if ( value > 0 && value <=100 ) {
                System.out.println("YELLOW");
            }
            else if ( value > 100 ) {
                System.out.println("GREEN");
            }

    }

     static void compareNumbers() {
        Scanner sc = new Scanner(System.in);
            int a = 0;
            int b = 0;
            System.out.println("a = ");
            a = sc.nextInt();
            System.out.println("b = ");
            b = sc.nextInt();
            System.out.println( a >= b ? "a >= b" : "a < b");
    }

}