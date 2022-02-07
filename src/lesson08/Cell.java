package lesson08;

import java.awt.Graphics2D;
import java.awt.Color;

/**
 * Java. Classic Game Snake
 * @author Sergey Iryupin
 * @version 0.7.7 dated Oct 26, 2021
 *
 * Java 1. HomeWork 8
 * @leaner PrihodchenkoDO
 * @version 07.02.2022
 */

public class Cell {
    private int x, y;
    private int size;
    private Color color;

    public Cell(int x, int y, int size, Color color) {
        set(x, y);
        this.size = size;
        this.color = color;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void paint(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x * size, y * size,
                size, size);
    }
}
