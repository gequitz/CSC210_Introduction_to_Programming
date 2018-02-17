/*
 * Assignment 6 (first part)
*/

package point;


public class Point {
    private double x, y;
    
    //constructor that takes arguments
    Point (double newX, double newY){
        x = newX;
        y = newY;
    }
   
    //default constructor
    Point (){
       // this(0,0);
        x=0.;
        y=0.;
        
    } 
    // accessor of variable x
    public double getX(){
        return x;
    }
    // accessor of variable y
    public double getY(){
        return y;
    }
    //mutator of variable x
    public void setX(double newX){
        x = newX;
    }
    //mutator of variable y
    public void setY(double newY){
        y = newY;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Main code (distance, slope, etc.)
        double x1 = 3.0;
        double y1 = 2.0;
        double x2 = 1.0;
        double y2 = 2.0;        
        double x3 = 2.0;
        double y3 = -5.0;
        
        // creating point 1
        Point p1 = new Point(x1,y1);
        
        //creating point p2
       // Point p2 = new Point(x2,y2); // can be done like that too        
        Point p2 = new Point() ;        
        p2.setX(x2);
        p2.setY(y2);    
        
        //creating point p3
        Point p3 = new Point(x3,y3);
        
        System.out.println("Distance between (3,2) and (1,2) : " + p1.distFromPoint(p2));        
        System.out.println("Slope of a line passing through (3,2) and (1,2) : " + p1.slope(p2));
        System.out.println("Distance of (3,2) and the origin : " + p1.distFromOrg());
        System.out.println("Point (2,-5) is in quadrant : " + p3.whatQuadrant());
    }
    
    //Distrance from Origin. Asssume to be (0,0) 
    public double distFromOrg()
    {
        double dist = Math.sqrt(x*x + y*y);
        return dist;
    }
    //Distance between two points (mutator)
    public double distFromPoint(Point P)
    {
       double dist = Math.sqrt((x-P.getX())*(x-P.getX()) + (y-P.getY())*(y-P.getY()));
       return dist;
    }
    //What quadrant is the point object in 
    public int whatQuadrant()
    {
        
        if (x > 0 && y > 0)
            return 1;
        else if(x < 0 && y > 0)
            return 2;
        else if (x < 0 && y < 0)
            return 3;
        else             
            return 4;
    }
    //Slope between two points 
    public double slope(Point P)
    {
        double slp = (y-P.getY())/(x-P.getX());
        return slp;
    }
    
}
