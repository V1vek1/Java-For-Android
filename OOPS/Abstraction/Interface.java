 
// package OOPS.Abstraction;

interface Animal{
    void walk();
}

class Horse implements Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
public class Interface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
