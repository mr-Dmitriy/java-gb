/**
 *  Java 1. HomeWork 7
 *
 * @author PrikhodchenkoDO
 * @version 03.02.2022
 */

package lesson07;

class Lesson7HomeWork {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat( "Murzik", 15),
                new Cat( "Barsik", 20),
                new Cat( "Vasya", 25),
        };

        for(Cat cat : cats) {
            System.out.println(cat);
        }

        Plate plate = new Plate(20);
        System.out.println( "\n" + "We are giving the food on" + plate + "\n");

        for(Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
            plate.addFood(50);
        }
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }
    public int getAppetite() {
        return appetite;
    }

    void eat(Plate plate) {
        if( plate.getFood() >= appetite && !isFull ){
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }

    @Override
    public String toString() {
        return name + ", appetite: " + appetite + ", is Full: " + isFull;
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }

    boolean decreaseFood(int sizeOfAppetite) {
        if (food >= sizeOfAppetite){
            food -= sizeOfAppetite;
            return true;
        } else {
            return false;
        }
    }

    void addFood(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}