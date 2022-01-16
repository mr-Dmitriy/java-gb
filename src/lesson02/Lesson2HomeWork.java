/**
 *  Java 1. HomeWork 2
 *
 * @author PrikhodchenkoDO
 * @version **.01.2022
 */

package lesson02;

class Lesson2HomeWork {
    public static void main(String[] args) {
        System.out.print(checkIfSumInRange(10,2 ) + "\n");
        checkTheSignOfNumeric(2);
        System.out.print(checkIfTheNumericIsNegative(10 ) + "\n");
        writeString("abds", 2);
        System.out.print(checkIfTheYearIsLeap(2022 ) + "\n");
    }

    static boolean checkIfSumInRange( int a, int b ) {
        return ( a + b ) >= 10 && ( a + b ) <= 20;
    }

    static void checkTheSignOfNumeric( int a ) {
        System.out.print( a >= 0 ? " a = " + a + " - positive\n" : " a = " + a + " - negative\n");
    }

    static boolean checkIfTheNumericIsNegative( int a ) {
        return a < 0;
    }

    static void writeString( String a, int n ) {
        int i = 0;
        while (i < n) {
            System.out.println(a);
            i++;
        }
    }

    static boolean checkIfTheYearIsLeap( int a ) {
        return ( a % 4 ) == 0 && ( a % 100 ) != 0 || ( a % 400 ) == 0 ;
    }

}



