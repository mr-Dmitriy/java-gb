package lesson08;

import java.util.Random;

/**
 * Java. Classic Game Snake
 * @author Sergey Iryupin
 * @version 0.7.7 dated Oct 26, 2021
 *
 * Java 1. HomeWork 8
 * @leaner PrihodchenkoDO
 * @version 07.02.2022
 */

class Food extends Cell {
    private Random random;
    private Snake snake;

    public Food(Snake snake) {
        super(-1, -1, GameSnake.CELL_SIZE, GameSnake.FOOD_COLOR);
        random = new Random();
        this.snake = snake;
    }

    public boolean isFood(int x, int y) {
        return (getX() == x) && (getY() == y);
    }

    public boolean isEaten() {
        return getX() == -1;
    }

    public void eat() {
        set(-1, -1);
    }

    public void appear() {
        int x, y;
        do {
            x = random.nextInt(GameSnake.CANVAS_WIDTH);
            y = random.nextInt(GameSnake.CANVAS_HEIGHT);
        } while (snake.isInSnake(x, y));
        set (x, y);
    }
}
