public class Square extends Rectangle {

    // Call to the Rectangle constructor
    public Square(double sideLength){
        super(sideLength, sideLength);
    }

    //Set both the width and height in the superclass
    public void setSideLength(double sideLength){
        super.setWidth(sideLength);
        super.setHeight(sideLength);
    }
    
    // Get the width and/or the height from the superclass
    public double area(){
        return (super.getWidth() * super.getHeight());
    }
    
    // Get the width and/or the height from the superclass
    public double perimeter(){
        return ((super.getWidth() * 2) + (super.getHeight() * 2));
    } 

    // Override to read: ___ x ____ Square
    public String toString(){
         return super.getWidth() + " x " + super.getHeight() + " Square";
        
    }
}
