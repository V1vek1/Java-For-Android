
abstract class Animal { // abstract ka matlab (khayal) imagination, hum soch to sakte h per use nahi kar
                        // sakte h
                        // Animal kuch nahi h bas ek concept/category hiske under me animals aate h
                        // aa yeh abstract h, to hum iske naam ka object nahi bna sakte h

    abstract void walk(); // hamne yha walk function ko bhi abstract bna diya h
                          // taki kisi bhi class me walks to use ho hi ho
     
    public void eat(){ //maine yha ek normal method bna diya bina abstract ke 
        System.out.println("Animals eats");
     }                     
}

//NOTE:- yeh total classes abstract Animal class inherit kar rahi h

class Horse extends Animal {

    Horse(){ // isko bolte h constructor 
        System.out.println("Created a Horse");
    }

    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class abtraction {
    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}
