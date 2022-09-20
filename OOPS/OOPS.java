
// Yeh CLASS h or jo String color yeh sab aap dekh rahe h 
// yeh h properties of class 
//NOTE:--> class name hamesa capital letter se start hota h

class Pen {
    String color;
    String type; // balpoint or Gel

    // Yeh Function bna hua h or hum yha or bhi functions bna
    // sakte h
    // NOTE:--> function hamesa small letter se start hota h

    public void write() {
        System.out.println("Writing something");
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

// Yeh Public CLASS h, jiske uper function define huaa h
// or class dono define hota h or call bhi huaa h, yha per
// hum or bhi classes bna sakte h, jaisa ki maine bnaya student
// naam ka class
// NOTE:--> class name hamesa capital letter se start hota h

class Student {
    String name;
    String age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2){   //Yha per Student() ek constructor h hum
                 //Hum () iske under bhi likhkar agrgument
                 //pass kra sakte h 
      this.name = s2.name;
      this.age = s2.age;

      System.out.println("Constructor called");  
    }
    
    Student(){ //yha per humne ek khali constructor bnaya
        // kyuki hame Student s1 ko bhi define karna padega
        // n kyu ki aab khud se to constructor ban nahi rha h

    }

}

public class OOPS {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "GEL";

        pen1.write();

        // Here we call the Student function

        Student s1 = new Student(); // yha per new ek keyword
                                    // h jo ki memory me new
                                    // memory screate kkaregi
                                    // or wa per student ka 
                                    // detail save hoga 
        s1.name = "Vivek";
        s1.age = "24";
        
        Student s2 = new Student(s1); // yhs per hamner s1 
                  //ki property kko s2 ko asign kar diya h
        s2.printinfo(); 
        s1.printinfo();
    }
} 