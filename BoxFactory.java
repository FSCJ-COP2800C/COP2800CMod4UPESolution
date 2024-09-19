// BoxFactory.java
// D. Singletary 
// 9/2/22
// Class which represents a factory containing boxes of various colors

public class BoxFactory {

    public static final int NUMBER_OF_BOXES = 3;
    
    private Box[] boxes;
    
    public BoxFactory() { }
    
    public BoxFactory(Box[] boxes) {
        this.boxes = boxes;
    }
        
    // toString
    @Override
    public String toString() {
        String retString = "Box Factory contents:\n"; // start here
        
        // append the boxes
        retString += "First Box is a " + this.boxes[0] + " box.\n";
        retString += "Second Box is a " + this.boxes[1] + " box.\n";
        retString += "And the final box is a " + 
                        this.boxes[2] + " box.";
        return retString;
    } 
    
    public static void main(String[] args) {

        // create a local array of boxes
        Box[] boxArray = new Box[NUMBER_OF_BOXES];
       
        // add boxes to the array
        boxArray[0] = new Box(Color.RED);
        boxArray[1] = new Box(Color.GREEN);
        boxArray[2] = new Box(Color.BLUE);
        
        // use the overloaded constructor to create our Box factory
        BoxFactory boxFact = new BoxFactory(boxArray);

        // print the state of the factory
        System.out.println(boxFact);
        
        // make some changes to test the mutator
        System.out.println("Testing mutators and accessors");             
        boxFact.boxes[0].setBoxColor(Color.BLUE); 
        boxFact.boxes[1].setBoxColor(Color.RED);   
        boxFact.boxes[2].setBoxColor(Color.GREEN); 
        
        // test the accessor
        System.out.println("first box: " + boxFact.boxes[0].getBoxColor());
        System.out.println("second box: " + boxFact.boxes[1].getBoxColor());
        System.out.println("third box: " + boxFact.boxes[2].getBoxColor());             
    }     
}

// enumerated type to represent color values
enum Color {
    NO_COLOR, RED, GREEN, BLUE;   
}


// class which represents a box
class Box {

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
    