/*    
Chapter 9 Programming excercise 08
Riky Hernandez
9/29/21
Description: Design a class named fan, code a program to create two fan objects. Dysplay the objects using the toString method 
─▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄
█░░░█░░░░░░░░░░▄▄░██░█
█░▀▀█▀▀░▄▀░▄▀░░▀▀░▄▄░█
█░░░▀░░░▄▄▄▄▄░░██░▀▀░█
─▀▄▄▄▄▄▀─────▀▄▄▄▄▄▄▀
         
*/
package chapter09_08;


public class Chapter09_08 {

   
    public static void main(String[] args) {        //using the fan class
       Fan fan = new Fan();
        fan.setSpeed(Fan.FAST);             //creating a new object using different values
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);
        System.out.println(fan.toString());
        
        System.out.print("\n");                 //character to split them to give it a clean look
                
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);          //creating a new object using different values
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
        
    }
    
}
