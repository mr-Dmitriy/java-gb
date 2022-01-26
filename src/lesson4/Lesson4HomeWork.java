/**
 *  Java 1. HomeWork 4
 *
 * @author PrikhodchenkoDO
 * @version 26.01.2022
 */


package lesson4;

import java.util.Random;
import java.util.Scanner;

class Lesson4HomeWork {

    final char DOT_O = 'o';
    final char DOT_X = 'x';
    final char DOT_EMPTY = '.';
    final int SIZEOFTABLE = 3;
    final int DOTS_TO_WIN = 3;
    final String MESSAGEFORHUMANWON = "YOU WON!";
    final String MESSAGEFORAIWON = "AI WON!";
    final String MESSAGEFORDROW = "Sorry, DRAW...";
    final String MESSAGEFORIFGAMEISOVER = "GAME OVER";
    Random random;
    Scanner scanner;
    char[][] table;

    public static void main(String[] args){
        new Lesson4HomeWork().game();
    }

    Lesson4HomeWork() {
        table = new char[SIZEOFTABLE][SIZEOFTABLE];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    void game() {
        initTable();
        prinTable();
        while (true) {
            turnHuman();
            if (checkWin(DOT_X)){
                System.out.println(MESSAGEFORHUMANWON);
                break;
            }
            if (isTableFull()){
                System.out.println(MESSAGEFORDROW);
                break;
            }
            turnAI();
            prinTable();
            if (checkWin(DOT_O)){
                System.out.println(MESSAGEFORAIWON);
                break;
            }
            if (isTableFull()){
                System.out.println(MESSAGEFORDROW);
                break;
            }
        }
        System.out.println(MESSAGEFORIFGAMEISOVER);
        prinTable();
    }

    void initTable() {
        for(int x = 0; x < SIZEOFTABLE; x++){
            for(int y = 0; y < SIZEOFTABLE; y++){
                table[x][y] = DOT_EMPTY;
            }
        }
    }

    void prinTable() {
        for(int x = 0; x < SIZEOFTABLE; x++){
            for(int y = 0; y < SIZEOFTABLE; y++){
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman(){
        int x, y;
        do {
            System.out.print("Enter x y [1..3]:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = DOT_X;
    }

    void turnAI(){
        int x, y;
        do {
            x = random.nextInt(SIZEOFTABLE);
            y = random.nextInt(SIZEOFTABLE);
        } while (!isCellValid(x, y));
        table[x][y] = DOT_O;
    }

    boolean isCellValid(int x, int y){
        if(x < 0 || y < 0 || x > SIZEOFTABLE || y > SIZEOFTABLE){
            return false;
        }
        return table[x][y] == DOT_EMPTY;
    }

    boolean checkWin(char ch){
        for ( int i = 0; i < SIZEOFTABLE; i++) {

            if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) ||
                    (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch))
                return true;

            if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) ||
                    (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch))
                return true;
        }
        return false;
    }

    boolean isTableFull(){
        for(int x = 0; x < SIZEOFTABLE; x++){
            for(int y = 0; y < SIZEOFTABLE; y++)  {
                if (table[x][y] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}

