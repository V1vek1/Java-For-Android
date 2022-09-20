//Single-Level-Inheritance --> matlab 1 level tak hi inherit kar pana
class Shape {
    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape{ //yha per Triangle Derived class or Shape base class h
                              //or Triangle class, class Shape ki sabhi properties ko 
                              //axcess kar rha h or yeh h Single-Level-Inheritance

     public void area(int l,int h){    //yha per hamne triangle ke liye area function bnaya h
            System.out.println(1/2*l*h);
     }
}

public class Single_level_inheritance {
    public static void main(String[] args) {
        
    }
}
