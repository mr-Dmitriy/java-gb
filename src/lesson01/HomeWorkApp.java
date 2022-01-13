package lesson01;
import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        a = sc.nextInt();
        System.out.println("b = ");
        b = sc.nextInt();
        System.out.println(((a + b) >= 0)? "Положительная" : "Отрицательная");
    }

    public static void printColor() {

        Scanner sc = new Scanner(System.in);
        String Cont = null;
        do{
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

            System.out.println("Repeat game? Yes - y, No - n");
            Cont = sc.next();
        }while (Cont.equals("y"));
    }

    public static void compareNumbers() {
        Scanner sc = new Scanner(System.in);
        String Cont = null;
        do{
            int a = 0;
            int b = 0;
            System.out.println("a = ");
            a = sc.nextInt();
            System.out.println("b = ");
            b = sc.nextInt();
            System.out.println( a >= b ? "a >= b" : "a < b");
            System.out.println("Repeat game? Yes - y, No - n");
            Cont = sc.next();
        }while (Cont.equals("y"));
    }

}