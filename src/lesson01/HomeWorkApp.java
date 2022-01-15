/**
 *  Java 1. HomeWork 1
 *
 * @author PrikhodchenkoDO
 * @version 12.01.2022
 */


package lesson01;


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
        int a = 2;
        int b = 3;
        System.out.println(((a + b) >= 0)? "Положительная" : "Отрицательная");
    }

    static void printColor() {
            int value = 5;
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
            int a = 5;
            int b = 7;
            System.out.println( a >= b ? "a >= b" : "a < b");
    }

}
