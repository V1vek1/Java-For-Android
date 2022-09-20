
// Yeh CLASS h or jo String color yeh sab aap dekh rahe h 
// yeh h properties of class 
//NOTE:--> class name hamesa capital letter se start hota h

class Student {
    String name;
    String age;
    
    //Humne yha same Three Function bnaye h......joki
    //polymorphism ka example h
    
    // hum functioon Overloading karte time same name
    // se parameter nahi de sakte h, or agar de bhi 
    // rahe h to hame or argument bhi use karna padega
    // like yha (String name) use huaa h to hum dusre
    // function me yehi agrument use nahi kar sakte h
    // agar karna bhi h to usme ek or agrument add 
    // karna padega like #rd no Function (String name ,int age)
    
    public void printinfo(String name){
        System.out.println(name);
    } 
    
    public void printinfo(int age){
        System.out.println(age);
    }
    
    public void printinfo(String name,int age) {
        System.out.println(name+" "+age);
    }

}

public class Polymorphism {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Here we call the Student function

        Student s1 = new Student(); // yha per new ek keyword
                                    // h jo ki memory me new
                                    // memory screate kkaregi
                                    // or wa per student ka
                                    // detail save hoga
        s1.name = "Vivek";
        s1.age = "20";

        s1.printinfo(s1.name);
        s1.printinfo(s1.age);
    }
}
