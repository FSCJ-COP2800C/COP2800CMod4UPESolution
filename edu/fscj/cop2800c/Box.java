// Box.java
// D. Singletary 
// 9/24/22
// Class which represents a box

package edu.fscj.cop2800c;

// class which represents a box
public class Box {

    // color is the only attribute
    private Color boxColor = Color.NO_COLOR;

    // default constructor
    public Box() { }
    
    // overloaded constructor which accepts a color parameter
    public Box(Color boxColor) { 
        this.boxColor = boxColor; 
    }
    
    // accessor
    public Color getBoxColor() { 
        return this.boxColor; 
    }
    
    // mutator
    public void setBoxColor(Color boxColor) { 
        this.boxColor = boxColor; 
    }
    
    // toString
    @Override
    public String toString() {
        return this.boxColor.name();
        //return this.boxColor.name().toLowerCase();
    }
}