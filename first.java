
import java.util.Scanner; //yeh likhna padta h jab hame user input lena hota java me tab

public class first {  // yha per public class ke bad aapne project ka naam dena hota h
                      // or public /class / tumhare project ka naam likhna hi padta h
    static int sum(int a, int b){
    return a+b;
                   }

    public static void main(String[] args) {

//********************************DATA_TYPES IN JAVA*********************************

        //  int a =3;
        //  float b = 45.22f;
        //  char grade = 'v';
        //  boolean isAdult = false; //

        //  System.out.println(a);
        //  System.out.println(b);
        //  System.out.println(grade);
        //  System.out.println(isAdult);



         	 // Write your code here
//        System.out.println("Hello World");
    



//**************************************Variables*********************************
    //  Just Like:
    //     -Water - Bucket
    //     -Masala - box
    //     -Lunch - LunchBox
    //  In Java:
    //  Variables are containers which store data values
    //  String, int, float, char, boolean
    //  How to declare variables:
    //  syntax - <dataType> <variableName> = <value>;
      




//     String name = "Harry";
//     String channel = "CodeWithHarry";
//     System.out.println(name);
//     System.out.println(name.length());
//     System.out.println(name.toUpperCase());
//     System.out.println(name.toLowerCase());
//     System.out.println(name + " from\" " + channel);
//     System.out.println(name + " from\\ " + channel);
//     System.out.println(name + " from\t " + channel);
//     System.out.println(name + " from\n " + channel);

//        System.out.println(name.contains("Har"));
//        System.out.println(name.charAt(2));
//        System.out.println(name.endsWith("ry"));
//        System.out.println(name.indexOf("rry"));





//        int numb1 = 4, numb2 = 7;
//        System.out.println(Math.max(numb1, numb2));
//        System.out.println(Math.min(numb1, numb2));
//        System.out.println(Math.sqrt(36));
//        System.out.println(Math.abs(-36));
//        System.out.println(Math.abs(6));
//        System.out.println(Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());




    //  int a = 45, x=56, y=67;
    //  float b = 45.22f;
    //  boolean isAdult = false;
//     System.out.println(x);
//     System.out.println(b);
//     System.out.println(isAdult);





    //  Rules for constructing name of variables in Java
    //     1. Can contain digits, underscores, dollar signs, letters
    //     2. Should begin with a letter, $ or _
    //     3. Java is case sensitive language which means that
    //        harry and Harry are two different variables altogether.
    //     4. Should not contain whitespaces
    //     5. You cannot use reserved keywords from Java
     
    


    // Two types of Java Data Types:
    //     1. Primitive - byte (1 byte), short (2 bytes), int(4 bytes), long (8 bytes), float(4 bytes),
    //        double (8 bytes), boolean(1 bit), char (2 bytes).
    //     2. Non Primitive or Reference Data Type -
    




//    byte u = -56;
//    double d = 45.635435345d;
//    System.out.println(d);
//    char rank = 'A';
//    System.out.println(rank);

    //  Operators in Java

    //     Operand, operator, Operand  =  Result
    //     4           +           7   =  11

    //     Types of operators in Java
    //     Arithmetic operators
    //     Assignment operators
    //     Logical Operators
    //     Comparison Operators
     




    // int num1 = 45, num2=78;
    // num1 += 3;
    // num2 -= 8;
    // Explore these operators - *=, /=, %=
//        System.out.print("The value of num1 + num2 is ");
//        System.out.println(num1 + num2);
//
//        System.out.print("The value of num1 - num2 is ");
//        System.out.println(num1 - num2);
//
//        System.out.print("The value of num1 * num2 is ");
//        System.out.println(num1 * num2);
//
//        System.out.print("The value of num1 / num2 is ");
//        System.out.println(num1 / num2);
//
//        System.out.print("The value of num1 % num2 is ");
//        System.out.println(num1 % num2);
//        System.out.println(num2++);
//        System.out.println(++num1);
//        System.out.println(num1--);
//        System.out.println(--num1);





    
    // ******************************* Comparison Operators:**********************
    // 1. == : checks for equality of two values
    // 2. != : checks if two values are not equal
    // 3. <
    // 4. >
    // 5. <=
    // 6. >=
    





    // ***************************Logical Operators:*************************

    // 1. && - Logical and operator - returns true only if both conditions are true
    // 2. || - Logical or operator - returns true if any one condition is true
    // 3. ! - Logical not - Reverse the result from true to false and vice versa
    





//************************************Taking user input****************************

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Your Age");
//        int age = scan.nextInt();
//        System.out.println(input);






//***********************************If-else conditionals***************************
//        if(age>20){
//
//            System.out.println("You are an adult");
//        }
//        else if(age>5){
//            System.out.println("You are not a kid");
//
//        }
//        else{
//            System.out.println("You are a kid");
//        }





//*********************************SWITCH CASE**************************************

//        switch (age){
//            case 12:
//                System.out.println("You are 12 years old");
//                break;
//            case 56:
//                System.out.println("You are 56 years old");
//                break;
//            case 16:
//                System.out.println("You are 16 years old");
//                break;
//            default:
//                System.out.println("You did not match any of the cases");
//        }
    // Quick Quiz: print sunday to saturday based on numbers 1 to 7 typed by the user






//********************************LOOPS**********************************************
        /*
        While Loop
        while(condition){
            // This code will keep executing until the condition is true
        }
         */
//        int i = 0;
//        while(i<100){
//            System.out.println(i);
//            i += 1;
//        }




//**************************************DO WHILE LOOP********************************
        /*
        Do While Loop
        do{
            // This code will keep executing until the condition is true
        }while(condition)
         */
//        int j = 0;
//        do{
//            System.out.println(j);
//            j += 1;
//        }while(j>100);




//**************************************FOR LOOP*******************************
        /*
        For Loop
        for(st1;st2;st3){
            //Code to be executed
            }
         */
//
//        for(int i=0;i<=10;i++){
//            if(i==2){
//                continue;
//            }
////            else{
////                System.out.println(i);
////            }
//            System.out.println(i);
//        }



//***********************************Java Arrays************************************
//        int [] marks = {1,2,3,5};
//        marks[3] = 34; // this will update marks[3]
//        System.out.println(marks[0]);
//        System.out.println(marks[3]);
//
//        // Classical way to iterate an array
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
//        System.out.println("This is for each loop:");
//
//        // For each loop
//        for(int value:marks){
//            System.out.println(value);
//        }
//
//        int [][] matrix = {{1,2,3},
//                            {4,5,6}};
//        System.out.println(matrix[0][1]);
//
//        String [] cars = {"Maruti Harry", "Maruti", "Suzuki", "Innova", "Ford Titanium"};
//        for(String value:cars){
//            System.out.println(value);
//        }




//**************************************Try - Catch*****************************

//        String [] cars = {"Maruti Harry", "Maruti", "Suzuki", "Innova", "Ford Titanium"};
//
//        try{
//            System.out.println(cars[3]);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//
//        System.out.println("Masoom");
//        System.out.println(sum(5, 7));




//*****************STAR pattern in JAVA************************ 

   // Create a new Scanner object
   Scanner scanner = new Scanner(System.in);

   // Get the number of rows from the user
   System.out.println("Enter the number of rows needed to print the pattern ");

   int rows = scanner.nextInt();
   System.out.println("## Printing the pattern ##");
   
   for (int i=1; i<=rows; i++)
   {
       // Print space in increasing order
       for (int j=1; j<i; j++) 
       { 
           System.out.print(" "); 
       } 
       // Print star in decreasing order 
       for (int k=rows; k>=i; k--)
       {
           System.out.print("*");
       }
       System.out.println();
   }
   scanner.close();
   

    }
}