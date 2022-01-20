/**
 *  Java 1. HomeWork 3
 *
 * @author PrikhodchenkoDO
 * @version 16.01.2022
 */

package lesson03;

import java.util.Arrays;

public class Lesson3HomeWork {
        public static void main(String[] args) {

            replaceArrayElements(new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0});

            print1DArray(100);

            changeElementsLess6(new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 });

            changeDiagonalsInArray(5,5);

            outputArrayWithGivenLengthValue(10, 333);

            findMinMaxInArray(new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 7 });

            System.out.println(checkbalance(new int[] { 1, 2, 2, 1 }));



        }


        static void replaceArrayElements( int[] arr ) {
            System.out.println("\nOld arrays - " + Arrays.toString(arr));
            for( int i = 0; i < arr.length; i++ ) {
                arr[i] = (arr[i] == 1)? 0:1;
            }
            System.out.println("Changed arrays - " + Arrays.toString(arr));
    }


        static void print1DArray(int length1darray) {
            int[] arr = new int[length1darray];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i+1;
            }
            System.out.print("\n1dArrays - " + Arrays.toString(arr) + "\n");
    }


        static void changeElementsLess6( int[] arr ) {
            System.out.println("\nOld arrays - " + Arrays.toString(arr));
            for( int i = 0; i < arr.length; i++ ) {
                arr[i] = ( arr[i] < 6 )? arr[i] * 2 : arr[i];
            }
            System.out.println("Changed arrays - " + Arrays.toString(arr) + "\n");
    }

        static void changeDiagonalsInArray(int lengthh,int lengthw) {
            int[][] arr = new int[lengthh][lengthw];
            for (int i = 0; i < arr.length; i++) {
                  for (int j = 0; j < arr[i].length; j++) {
                        if ( i == j || i == arr[i].length - 1 - j ) {
                        arr[i][j] = 1;
                        }
                  System.out.print(arr[i][j]  + " ");
                  }
                System.out.println("");
            }
        }


        static void outputArrayWithGivenLengthValue(int len, int initialValue) {
            int[] arr = new int[len];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = initialValue;
            }
            System.out.print("\n1dArrays - " + Arrays.toString(arr) + "\n");
        }

        static void findMinMaxInArray( int[] arr ) {
            System.out.println("\narrays - " + Arrays.toString(arr));
            int mininarray = arr[0];
            int maxinarray = arr[0];
            for (int i = 0; i < arr.length; i++) {

                if( mininarray > arr[i] )
                    mininarray = arr[i];
                if( maxinarray < arr[i] )
                    maxinarray = arr[i];
            }
        System.out.print("Min in 1dArrays - " + mininarray + "\nMax in 1dArrays - " + maxinarray +"\n");
        }

        static boolean checkbalance( int[] arr ) {
            System.out.println("\narrays - " + Arrays.toString(arr));
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.println(sum);
            int sumelements = 0;
            int i=0;
            do {
                sumelements = sumelements + arr[i];
                sum = sum - arr[i];
                i++;
            } while(sum != sumelements);

        return sum == sumelements;

        }


}





