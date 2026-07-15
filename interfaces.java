interface Animal {
    int eyes = 2;
    public void walk();

    // Animal()
    // {
        
    // } //error
}

interface Herbivore {
    
}
class Horse implements Animal, Herbivore {
    public void walk()
    {
        System.out.println("Walk on 4 legs");    
    }
}
public class interfaces {
    Horse horse = new Horse();
    //horse.walk();
}
