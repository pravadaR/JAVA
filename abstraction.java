abstract class Animal {
    abstract void walk();

    Animal()
    {

    }
    public void eat()
    {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse()
    {
        System.out.println("Creates a Horse");
    }
    public void walk()
    {
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal {
    public void walk()
    {
        System.out.println("Walks on 2 legs");
    }
}
public class abstraction {
    public static void main(String args[])
    {
        //Horse horse = new Horse();
        //horse.walk();
        // Animal animal = new Animal();
        // animal.walk();//error
        //horse.eat();

    }
}
