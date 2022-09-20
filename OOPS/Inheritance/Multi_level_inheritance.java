
//Multi-Level-Inheritance --> matlab 1 level se jada tak inherit kar pana..
// yeh h base yani child class 
class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

//  yeh h derived class 
class Triangle extends Shape { // yha per Triangle Derived class or Shape base class h
                               // or Triangle class, class Shape ki sabhi properties ko
                               // axcess kar rha h or yeh h Single-Level-Inheritance

    public void area(int l, int h) { // yha per hamne triangle ke liye area function bnaya h
        System.out.println(1 / 2 * l * h);
    }
}

// Yeh bhi h derived class 
class EquilateralTriangle extends Triangle { // Equilateral Triangle Derived class h
                                             // or triangle base/child class h to yha per Eqilateral triangle
                                             // triangle ki sabhi properties ko inherit karti h
    public void area(int l, int h) { // yha per hamne triangle ke liye area function bnaya h
        System.out.println(1 / 2 * l * h);
    }
}

// Yeh bhi h Derived class
public class Multi_level_inheritance {
    public static void main(String[] args) {

        Triangle t1 = new Triangle(); // yeh Triangle class ke property ko print kar rha h
        t1.area();
        
        EquilateralTriangle t2 = new EquilateralTriangle();
        
    }
}

// NOTES:- yeh h Multi level Inheritance jaisa ki hum dekh pa rahe h ki hamne
// Shape class bhaya

// phir Shape class se triangle class ne shape class ki properties ko inherit
// kiya phir hamne

// Equilateral triangle class bnaya joki Triangle class se properties ko inherit
// kar rha h

// ab ek 4th derived class bnaya joki Circle class h, joki Equilateral triangle se 
// properties ko inherit kar rha h