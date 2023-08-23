/*

This is the basics for java. Aug 23, 2023
Use w2schools.com
Another way to write comments 

*/

package javaproject1;

public class JavaProject1 {
    public static void main(String[] args) {
        
        String name = "Nicholas leal";
        String firstName = "Ema ";
        String lastName = "Bau";
        String fullName = firstName + lastName;
        int number = '1';
        float myFloatNum = 1.932456f; // Must put a 'f' at the end of a decimal and must use float
        char myLetter = 'E';
        boolean myAnswer = true;
        int x = 5;
        int y = 10;
        int z = 15;
        
        //Good Example of a Java identifier
        int minutesPerBeat = 70;
        
        //byte only stores from -128 to 127
        byte myNum = 126;
        
     
        /*
        Java Data Types
        
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String
        
        */
        
        // Output for the different data types
        System.out.println("Hello World");
        System.out.println(9+9);
        System.out.println(name);
        System.out.println(number);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myAnswer);
        System.out.println("Hello " + name);
        System.out.println(firstName +lastName);
        System.out.println(fullName);
        System.out.println(x + y + z);
        System.out.println(minutesPerBeat);
        System.out.println(myNum);
    }
}

