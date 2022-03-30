
package chapter09_08;


public class Fan {
    
    public static final int SLOW = 1;           //constants, their value will never change
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    private int speed = SLOW;       //specific the speed of the fan
    private  boolean on = false;            //specifies if th fan is on 
    private double radius  = 5;                     //specifies the radius of the fan
    private String color = "blue";                      //specifies the color of the fam
    
    public Fan(){
        
    }
            
    public int getSpeed(){                      // getter and setter 
        return speed;                                   // able to change the values of speed,radius, color , on/off
    }
        
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public boolean isOn(){
        return on;
    }
    
    public void setOn(boolean on){
        this.on = on;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius (double radius){
        this.radius = radius;
    }
    
    public String getColor(){
        return color;
    }
      
    public void setColor(String color){
        this.color = color;
    }
    
    public String toString(){                       //returns a description of the fan, returns fan speed,color,radius,on/off
        return "speed " + speed + "\n"
                + "color " + color + "\n"
                + "radius " + radius + "\n"
                + ((on) ? "Fan is on": "Fan is off");
    }
}
