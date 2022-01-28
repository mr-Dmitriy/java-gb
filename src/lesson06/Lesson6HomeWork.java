/**
 *  Java 1. HomeWork 6
 *
 * @author PrikhodchenkoDO
 * @version 28.01.2022
 */



package lesson06;

public class Lesson6HomeWork {
    public static void main(String[] args) {

        IAnimal[] animals = {
            new Cat( "Murzik", 200, 0 ),
            new Cat( "Barsik", 200, 0 ),
            new Dog( "Bin", 500, 10 ),
            new Dog( "Cesar", 500, 10 )
        };

        for(IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(50));
            System.out.println(animal.swim(5));
        }
        System.out.println("Number of animal = " + Animal.getAnimalCnt());
        System.out.println("Number of cat = " + Cat.getCatCnt());
        System.out.println("Number of dog = " + Dog.getDogCnt());
    }
}



interface IAnimal {
    String run(int distance);
    String swim(int distance);
}

abstract class Animal implements IAnimal {
    protected static int cntanimal;
    protected String name;
    protected int maxdistancetorun;
    protected int maxdistancetoswim;



    public Animal( String name, int maxdistancetorun, int maxdistancetoswim ) {
        this.name = name;
        this.maxdistancetorun = maxdistancetorun;
        this.maxdistancetoswim = maxdistancetoswim;
        cntanimal++;
    }

    public static int getAnimalCnt() {
        return cntanimal;
    }

    @Override
    public String run(int distance) {
        return ( distance >= 0 && distance <= maxdistancetorun )? " dog " + name + " run " + distance :
                " dog " + name + " couldn't run ";
    }
    @Override
    public String swim(int distance) {
        return ( distance >= 0 && distance <= maxdistancetoswim )? " dog " + name + " swim " + distance :
                " dog " + name + " couldn't swim ";
    }

    @Override
    public String toString(){
        return name + ", " + maxdistancetorun + ", " + maxdistancetoswim;
    }
}

class Dog extends Animal {
    protected static int cntdog;
    public Dog( String name, int maxdistancetorun, int maxdistancetoswim ) {
        super( name, maxdistancetorun, maxdistancetoswim);
        cntdog++;
    }
    public static int getDogCnt() {
        return cntdog;
    }
}


class Cat extends Animal {
    protected static int cntcat;
    public Cat( String name, int maxdistancetorun, int maxdistancetoswim ) {
        super(name, maxdistancetorun, maxdistancetoswim);
        cntcat++;
    }
    public static int getCatCnt() {
         return cntcat;
    }

    @Override
    public String swim( int distance ) {
        return " Cat " + name + " don't know how to swim ";
    }
}




